package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cc2 implements fz8 {
    public final /* synthetic */ byte a;

    public /* synthetic */ cc2(byte b) {
        this.a = b;
    }

    @Override // defpackage.fz8
    public final hz8 a(Object obj, vrf vrfVar, ylh ylhVar) {
        byte b = 0;
        byte b2 = 1;
        byte b3 = 2;
        switch (this.a) {
            case 0:
                apm apmVar = (apm) obj;
                Bitmap.Config[] configArr = nzm.a;
                if (Intrinsics.a(apmVar.c, "file") && Intrinsics.a(CollectionsKt.firstOrNull(m5h.j(apmVar)), "android_asset")) {
                    return new dc2(apmVar, vrfVar, b);
                }
                return null;
            case 1:
                return new mg3((Bitmap) obj);
            case 2:
                return new t24((byte[]) obj, vrfVar, b);
            case 3:
                return new t24((ByteBuffer) obj, vrfVar, b2);
            case 4:
                apm apmVar2 = (apm) obj;
                if (Intrinsics.a(apmVar2.c, "content")) {
                    return new dc2(apmVar2, vrfVar, b2);
                }
                return null;
            case 5:
                apm apmVar3 = (apm) obj;
                if (Intrinsics.a(apmVar3.c, "data")) {
                    return new dc2(apmVar3, vrfVar, b3);
                }
                return null;
            case 6:
                return new t24((Drawable) obj, vrfVar, b3);
            case 7:
                apm apmVar4 = (apm) obj;
                String str = apmVar4.c;
                if ((str != null && !str.equals("file")) || apmVar4.e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = nzm.a;
                if (Intrinsics.a(apmVar4.c, "file") && Intrinsics.a(CollectionsKt.firstOrNull(m5h.j(apmVar4)), "android_asset")) {
                    return null;
                }
                return new dc2(apmVar4, vrfVar, (byte) 3);
            case 8:
                apm apmVar5 = (apm) obj;
                if (Intrinsics.a(apmVar5.c, "jar:file")) {
                    return new dc2(apmVar5, vrfVar, (byte) 4);
                }
                return null;
            default:
                apm apmVar6 = (apm) obj;
                if (Intrinsics.a(apmVar6.c, "android.resource")) {
                    return new dc2(apmVar6, vrfVar, (byte) 5);
                }
                return null;
        }
    }
}
