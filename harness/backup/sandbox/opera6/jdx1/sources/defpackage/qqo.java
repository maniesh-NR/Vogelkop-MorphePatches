package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.d;

/* loaded from: classes.dex */
public final class qqo extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qqo(Object obj, byte b) {
        super(0);
        this.i = b;
        this.j = obj;
    }

    public static final Pair d(Pair pair) {
        Pair q0iVar;
        d dVarB;
        Number numberValueOf;
        String str = (String) pair.a;
        String str2 = (String) pair.b;
        if (str.length() > 2) {
            boolean z = true;
            if (str.charAt(1) == '.') {
                try {
                    p0i p0iVar = t0i.b;
                    char cCharAt = str.charAt(0);
                    if (cCharAt == 'b') {
                        if (!Intrinsics.a(str2, "true")) {
                            if (!Intrinsics.a(str2, "false")) {
                                throw new IllegalArgumentException("The string doesn't represent a boolean value: " + str2);
                            }
                            z = false;
                        }
                        dVarB = qqb.a(Boolean.valueOf(z));
                    } else {
                        if (cCharAt == 'i') {
                            numberValueOf = Integer.valueOf(Integer.parseInt(str2));
                        } else if (cCharAt == 'l') {
                            numberValueOf = Long.valueOf(Long.parseLong(str2));
                        } else if (cCharAt == 'f') {
                            numberValueOf = Float.valueOf(Float.parseFloat(str2));
                        } else if (cCharAt == 'd') {
                            numberValueOf = Double.valueOf(Double.parseDouble(str2));
                        } else {
                            dVarB = null;
                        }
                        dVarB = qqb.b(numberValueOf);
                    }
                    q0iVar = dVarB != null ? new Pair(str.substring(2), dVarB) : null;
                } catch (Throwable th) {
                    p0i p0iVar2 = t0i.b;
                    q0iVar = new q0i(th);
                }
                Pair pair2 = q0iVar instanceof q0i ? null : q0iVar;
                if (pair2 != null) {
                    return pair2;
                }
            }
        }
        return new Pair(str, qqb.c(str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqo.invoke():java.lang.Object");
    }
}
