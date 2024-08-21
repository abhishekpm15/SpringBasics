package org.example.firstBean;


public class FirstBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "FirstBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
