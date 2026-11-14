package defpackage;

import ads_mobile_sdk.iu0;
import ads_mobile_sdk.jq0;
import ads_mobile_sdk.t70;
import android.app.Application;
import android.os.Environment;
import android.view.Choreographer;
import com.opera.android.browser.obml.Platform;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wv0 extends kuk implements Function2 {
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wv0(int i, mt5 mt5Var, byte b) {
        super(i, mt5Var);
        this.t = b;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new wv0(2, mt5Var, (byte) 0);
            case 1:
                return new wv0(2, mt5Var, (byte) 1);
            case 2:
                return new wv0(2, mt5Var, (byte) 2);
            case 3:
                return new wv0(2, mt5Var, (byte) 3);
            case 4:
                return new wv0(2, mt5Var, (byte) 4);
            case 5:
                return new wv0(2, mt5Var, (byte) 5);
            case 6:
                return new wv0(2, mt5Var, (byte) 6);
            case 7:
                return new wv0(2, mt5Var, (byte) 7);
            case 8:
                return new wv0(2, mt5Var, (byte) 8);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new wv0(2, mt5Var, (byte) 9);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new wv0(2, mt5Var, (byte) 10);
            case 11:
                return new wv0(2, mt5Var, (byte) 11);
            default:
                return new wv0(2, mt5Var, (byte) 12);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = 2;
        switch (this.t) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 3:
                return create((toi) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 4:
                return create((l99) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 5:
                new wv0(i, (mt5) obj2, (byte) 5);
                Unit unit = Unit.a;
                px5 px5Var = px5.a;
                ybh.y(unit);
                return unit;
            case 6:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 7:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 8:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                create((Throwable) obj, (mt5) obj2).invokeSuspend(Unit.a);
                return Boolean.FALSE;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                new wv0(i, (mt5) obj2, (byte) 10);
                Unit unit2 = Unit.a;
                px5 px5Var2 = px5.a;
                ybh.y(unit2);
                return unit2;
            case 11:
                return new wv0(i, (mt5) obj2, (byte) 11).invokeSuspend(Unit.a);
            default:
                return new wv0(i, (mt5) obj2, (byte) 12).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final Object invokeSuspend(Object obj) throws IOException {
        int i = 0;
        i = 0;
        i = 0;
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                SecureRandom secureRandom = new SecureRandom();
                byte[] bArr = new byte[16];
                secureRandom.nextBytes(bArr);
                byte[] bArr2 = new byte[16];
                secureRandom.nextBytes(bArr2);
                if (bArr.length != 16) {
                    qp2.o("Signing key must be 128 bits");
                    return null;
                }
                if (bArr2.length != 16) {
                    qp2.o("Encryption key must be 128 bits");
                    return null;
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
                byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, 16);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(32);
                    try {
                        byteArrayOutputStream.write(bArrCopyOf);
                        byteArrayOutputStream.write(bArrCopyOf2);
                        String strEncodeToString = co5.a.encodeToString(byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.close();
                        return strEncodeToString;
                    } finally {
                    }
                } catch (IOException e) {
                    h9o.m(e.getMessage(), e);
                    return null;
                }
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                return Choreographer.getInstance();
            case 2:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                return Platform.c();
            case 3:
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                return Unit.a;
            case 4:
                px5 px5Var5 = px5.a;
                ybh.y(obj);
                return Unit.a;
            case 5:
                px5 px5Var6 = px5.a;
                ybh.y(obj);
                return Unit.a;
            case 6:
                px5 px5Var7 = px5.a;
                ybh.y(obj);
                Application application = cbp.b;
                Application application2 = cbp.b;
                if (application2 != null) {
                    jno jnoVar = jno.a;
                    if (cbp.c != null) {
                        jno.a(application2, false);
                    } else if (cbp.d != null) {
                        gh2 gh2Var = new gh2((byte) 14, application2, i);
                        cbp.c(gh2Var, gh2Var);
                    }
                }
                return Unit.a;
            case 7:
                px5 px5Var8 = px5.a;
                ybh.y(obj);
                zyk zykVar = fap.a;
                try {
                    if (Intrinsics.a(Environment.getExternalStorageState(), "mounted")) {
                        if (Environment.isExternalStorageRemovable()) {
                            i = 1;
                        }
                    }
                } catch (Exception unused) {
                }
                return new Integer(i);
            case 8:
                px5 px5Var9 = px5.a;
                ybh.y(obj);
                oxo oxoVar = oxo.a;
                return (String) oxo.i.getValue();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                px5 px5Var10 = px5.a;
                ybh.y(obj);
                return Boolean.FALSE;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                px5 px5Var11 = px5.a;
                ybh.y(obj);
                return Unit.a;
            case 11:
                px5 px5Var12 = px5.a;
                ybh.y(obj);
                i6p i6pVarV = jq0.v();
                i6pVarV.b$1();
                jq0 jq0Var = ((iu0) i6pVarV).b;
                jq0.R(jq0Var, jq0.O(jq0Var) | 4);
                jq0.S(jq0Var);
                return i6pVarV.a();
            default:
                px5 px5Var13 = px5.a;
                ybh.y(obj);
                return t70.p();
        }
    }
}
