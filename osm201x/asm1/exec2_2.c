#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <pthread.h>

#define NUM_THREADS 4

void *hello(void * );

pthread_mutex_t lock = PTHREAD_MUTEX_INITIALIZER; 

int main() {
  int j;
  pthread_t tid[NUM_THREADS];

  printf("My process ID %d\n", getpid());
 
  pthread_mutex_lock(&lock);
  for (j = 0; j < NUM_THREADS; j++)
    pthread_create(&tid[j], NULL, hello, &j);
  pthread_mutex_unlock(&lock);

  for (int i = 0; i < NUM_THREADS; i++)
    pthread_join(tid[i], NULL);

  return 0;
}

void *hello(void * my_id) {
  printf("Hello World from branch thread %d\n", *(int * ) my_id);
}