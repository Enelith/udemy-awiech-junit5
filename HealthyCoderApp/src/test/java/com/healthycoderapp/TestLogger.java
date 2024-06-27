package com.healthycoderapp;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

class TestLogger implements TestWatcher {

    @Override
    public void testSuccessful(ExtensionContext context) {
        System.out.println("Finished executing test: " + context.getDisplayName());
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        System.out.println("Test failed: " + context.getDisplayName());
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        System.out.println("Test aborted: " + context.getDisplayName());
    }

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        System.out.println("Test disabled: " + context.getDisplayName() + " with reason: " + reason.orElse("No reason"));
    }

    /*
    @Override
    public void testStarted(ExtensionContext context) {
        System.out.println("About to execute test: " + context.getDisplayName());
    }
    */
}