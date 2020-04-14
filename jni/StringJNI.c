#include <jni.h>
#include <stdio.h>
#include "com_achanzhang_free_StringJNI.h"

JNIEXPORT jstring JNICALL Java_com_achanzhang_free_StringJNI_sayHello (JNIEnv *env, jobject thisObj, jstring name) {
    char buf[128];
    const jbyte *str;
    /* jstring转为char* */
    /* GetStringUTFChars得到char*是在堆中开辟了新的空间用于存储字符串，用完需要手动回收 */
    str = (*env)->GetStringUTFChars(env, name, NULL);
    if (str == NULL) {
        return NULL; /* OutOfMemoryError already thrown */
    }
    printf("Hello %s", str);
    (*env)->ReleaseStringUTFChars(env, name, str);
    /* 假设输入字符不超过127个 */
    scanf("%s", buf);
    /* 使用NewStringUTF创建的jstring对象属于java.lang.String实例对象 */
    /* 虚拟机会自动回收，另外用于转换为jstring的char*对象（即例子中的buf）由于是函数内部的局部变量 */
    /* 当Java_com_huachao_java_HelloJNI_sayHello执行结束后，自然会回收其内部所有的局部变量的空间 */
    return (*env)->NewStringUTF(env, buf);
}