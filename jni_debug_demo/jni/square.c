#include "square.h"
 
JNIEXPORT jint JNICALL Java_com_example_jni_1debug_1demo_SquaredWrapper_squared (JNIEnv * je, jclass jc, jint base)
{
    return (base*base);
}
