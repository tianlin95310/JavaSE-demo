package com.my;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorServiceManager
{

	public static ExecutorService executorService;
	
	 // 线程工厂
    private static ThreadFactory threadFactory = new ThreadFactory() {
        private final AtomicInteger integer = new AtomicInteger();

        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "myThreadPool thread:"
                    + integer.getAndIncrement());
        }
    };
    
	static {
		executorService = Executors.newFixedThreadPool(3, threadFactory);
	}
	public static void main(String[] args)
	{
		Future<String> future = executorService.submit(new Callable<String>()
		{
			@Override
			public String call() throws Exception
			{
				return "call";
			}
		});
		
		try
		{
			System.out.println(future.get());
		} catch (InterruptedException e1)
		{
			e1.printStackTrace();
		} catch (ExecutionException e1)
		{
			e1.printStackTrace();
		}
		
		executorService.submit(new Runnable()
		{
			@Override
			public void run()
			{
				for(int i = 0; i < 100; i++)
				{
					System.out.println(Thread.currentThread().getName() + "submit" + i);
					try
					{
						Thread.sleep(500);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		
		executorService.execute(new Runnable()
		{
			
			@Override
			public void run()
			{
				for(int i = 0; i < 100; i++)
				{
					System.out.println(Thread.currentThread().getName() + "execute" + i);
					try
					{
						Thread.sleep(1000);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		});
	}

}
