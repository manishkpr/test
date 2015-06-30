LOCAL_PATH := $(call my-dir)
 
include $(CLEAR_VARS)

LOCAL_LDLIBS := -llog

LOCAL_MODULE    := squared
LOCAL_SRC_FILES := square.c
 
include $(BUILD_SHARED_LIBRARY)
