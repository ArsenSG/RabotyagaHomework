public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

//    public Worker(OnTaskDoneListener callback) {
//        this.callback = callback;
//    }

    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 33 ; i++) {
            errorCallback.onError("Task " + i + " is done");
        }
        errorCallback.onError("Task " + 33 + " is not done");
        for (int j = 34; j < 100; j++) {
            errorCallback.onError("Task " + j + " is done");
        }
    }
}
