use jni::{objects::JObject, sys::jint, JNIEnv};

#[no_mangle]
pub extern "system" fn Java_xianzhan_jni_rs_NumMain_plusOne(
    _env: JNIEnv,
    _obj: JObject,
    x: jint,
) -> jint {
    x + 1
}

#[no_mangle]
pub extern "system" fn Java_xianzhan_jni_rs_NumMain_power(env: JNIEnv, obj: JObject) -> jint {
    let ret = env.get_field(obj, "internalValue", "I");
    let internal_value = ret.unwrap().i().unwrap();
    internal_value.pow(2)
}
