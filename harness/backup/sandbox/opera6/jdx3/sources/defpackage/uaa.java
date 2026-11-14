package defpackage;

import com.leanplum.internal.Constants;
import com.opera.android.utilities.HiddenApis$Helper$Class;
import com.opera.android.utilities.HiddenApis$Helper$HandleInfo;
import com.opera.android.utilities.HiddenApis$Helper$MethodHandle;
import com.opera.android.utilities.HiddenApis$Helper$MethodHandleImpl;
import com.opera.android.utilities.HiddenApis$Helper$NeverCall;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class uaa {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;

    static {
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", null).invoke(null, null);
            a = unsafe;
            long jObjectFieldOffset = unsafe.objectFieldOffset(HiddenApis$Helper$MethodHandle.class.getDeclaredField("artFieldOrMethod"));
            b = jObjectFieldOffset;
            c = unsafe.objectFieldOffset(HiddenApis$Helper$MethodHandleImpl.class.getDeclaredField(Constants.Params.INFO));
            long jObjectFieldOffset2 = unsafe.objectFieldOffset(HiddenApis$Helper$Class.class.getDeclaredField("iFields"));
            d = unsafe.objectFieldOffset(HiddenApis$Helper$Class.class.getDeclaredField("sFields"));
            e = unsafe.objectFieldOffset(HiddenApis$Helper$HandleInfo.class.getDeclaredField("member"));
            Field declaredField = HiddenApis$Helper$NeverCall.class.getDeclaredField("i");
            Field declaredField2 = HiddenApis$Helper$NeverCall.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle methodHandleUnreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            long j = unsafe.getLong(methodHandleUnreflectGetter, jObjectFieldOffset);
            long j2 = unsafe.getLong(methodHandleUnreflectGetter2, jObjectFieldOffset);
            long j3 = unsafe.getLong(HiddenApis$Helper$NeverCall.class, jObjectFieldOffset2);
            f = j2 - j;
            g = j - j3;
        } catch (ReflectiveOperationException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }
}
