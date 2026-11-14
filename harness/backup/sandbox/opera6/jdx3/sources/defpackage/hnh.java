package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hnh implements lkf, mkf {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Function0 c;
    public final Object d;
    public final Function0 e;
    public final Function0 f;
    public final Function0 g;

    public /* synthetic */ hnh(Object obj, Function0 function0, Object obj2, Function0 function02, Function0 function03, Function0 function04, byte b) {
        this.a = b;
        this.b = obj;
        this.c = function0;
        this.d = obj2;
        this.e = function02;
        this.f = function03;
        this.g = function04;
    }

    @Override // defpackage.mkf
    public final l7n a(Class cls) {
        byte b = this.a;
        return null;
    }

    public final Fragment b(Class cls) {
        byte b = this.a;
        Function0 function0 = this.g;
        Function0 function02 = this.f;
        Function0 function03 = this.e;
        Object obj = this.d;
        Function0 function04 = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (Intrinsics.a(cls, knh.class)) {
                    return new knh((gjm) obj2, (fnh) ((cw3) function04).invoke(), (u4l) ((cw3) obj).invoke(), (yqa) ((cw3) function03).invoke(), (ysj) ((cw3) function02).invoke(), (inh) ((cw3) function0).invoke());
                }
                return null;
            default:
                if (Intrinsics.a(cls, gcj.class)) {
                    return new gcj((dx3) obj2, (ag7) ((cw3) function04).invoke(), (umi) obj, (nej) ((cw3) function03).invoke(), (ysj) ((cw3) function02).invoke(), (orm) ((et3) function0).invoke());
                }
                return null;
        }
    }
}
