#include<jni.h>
#include<stdio.h>
#include "com_achanzhang_free_HelloJNI.h"

JNIEXPORT void JNICALL Java_com_achanzhang_free_HelloJNI_sayHello (JNIEnv *env, jobject thisObj) {
    printf("Hello World!\n");
    return;
}