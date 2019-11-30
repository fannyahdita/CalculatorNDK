#include "jni.h"

JNIEXPORT jint JNICALL Java_id_ac_ui_cs_mobileprogramming_fannyah_calculatorndk_MainActivity_calculator
  (JNIEnv * env, jobject obj, jint value1, jint value2) {
		return (value1 + value2);
}
