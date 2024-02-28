package com.directi.training.ocp.exercise;

public class TimeSlotAllocator implements ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;

    @Override
    public int allocate() {
        int resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markTimeSlotFree(resourceId);
    }

    private void markTimeSlotFree(int resourceId) {
    }

    private void markTimeSlotBusy(int resourceId) {
    }

    private int findFreeTimeSlot() {
        return 0;
    }
}
