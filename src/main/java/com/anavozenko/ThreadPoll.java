package com.anavozenko;


/**
 * We need to implement our own version of a fixed thread pool in Java.
 * This custom thread pool should allow tasks to be submitted for execution and reuse existing threads from a pool when tasks are finished.
 *
 * Here's a step-by-step plan to implement this (This is just example):
 *
 * -  Define a Class: Create a Java class named FixedThreadPool.
 * -  Constructor: Implement a constructor in the FixedThreadPool class to initialize the thread pool with a specified number of threads.
 * - Task Queue: Use a blocking queue to hold pending tasks. This will allow threads to wait for tasks when the queue is empty.
 * - Submit Method: Write a method named submit() that allows tasks to be submitted to the thread pool for execution. Tasks should be added to the task queue.
 * - Worker Threads: Create an inner class representing worker threads. These threads will continuously fetch and execute tasks from the task queue.
 * - Task Execution: In the run() method of the worker threads, continuously retrieve tasks from the task queue and execute them.
 * - Reuse Threads: After executing a task, the worker thread should remain alive and ready to accept new tasks from the task queue.
 * - Shutdown Method: Implement a shutdown() method to gracefully shut down the thread pool.
 *   This method should stop accepting new tasks, wait for the remaining tasks to finish, and then terminate the worker threads.
 * - Exception Handling: Ensure proper exception handling throughout the implementation to handle potential errors and interruptions gracefully.
 * - Testing: Thoroughly test the implementation to verify its correctness and functionality.
 *   Test different scenarios, such as submitting tasks concurrently and shutting down the thread pool while tasks are still running.
 *
 */
public class ThreadPoll {
}
