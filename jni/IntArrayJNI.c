#include <jni.h>
#include <stdio.h>
#include "com_achanzhang_free_IntArrayJNI.h"


JNIEXPORT jint JNICALL Java_com_achanzhang_free_IntArrayJNI_sumArray (JNIEnv *env, jobject thisObject, jintArray arr) {
    jint *carr;
    jint i,sum = 0;
    carr = (*env)->GetIntArrayElements(env, arr, NULL);
    if (carr == NULL) {
        return 0;
    }
    for (i = 0 ; i < 10 ; i++) {
        sum += carr[i];
    }
    (*env)->ReleaseIntArrayElements(env, arr, carr, 0);
    return sum;
}