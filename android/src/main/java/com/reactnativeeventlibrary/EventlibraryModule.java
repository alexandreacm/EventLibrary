package com.reactnativeeventlibrary;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class EventlibraryModule extends ReactContextBaseJavaModule {
    public static final String NAME = "Eventlibrary";

    public EventlibraryModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void onMyEvent(String appName,Promise promise) {
      /* Create two objects using constructor */
      Employee empOne = new Employee("Alexandre Marques");

      // Invoking methods for each object created
      empOne.setAge(41);
      empOne.setDesignation("Senior Software Engineer");
      empOne.setSalary(5500);

      empOne.printEmployee();

      promise.resolve(appName +  empOne.getName());
    }
}
