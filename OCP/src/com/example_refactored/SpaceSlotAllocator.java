package com.directi.training.ocp.exercise;

public class SpaceSlotAllocator implements ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;

    @Override
    public int allocate() {
        int resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }

    private void markSpaceSlotFree(int resourceId) {
    }

    private void markSpaceSlotBusy(int resourceId) {
    }

    private int findFreeSpaceSlot() {
        return 0;
    }
}
