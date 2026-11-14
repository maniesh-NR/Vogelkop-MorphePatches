package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import defpackage.tkl;
import defpackage.wdp;
import java.util.Optional;

/* loaded from: classes.dex */
public final class f8 implements wdp {
    public final Optional a;
    public final Optional b;
    public final av2 c;
    public final Context d;
    public final qr0 e;
    public final kj0 f;

    public f8(Optional optional, Optional optional2, av2 av2Var, Context context, qr0 qr0Var, kj0 kj0Var) {
        this.a = optional;
        this.b = optional2;
        this.c = av2Var;
        this.d = context;
        this.e = qr0Var;
        this.f = kj0Var;
    }

    public final int a(int i) {
        float fA;
        float f = i;
        DisplayMetrics displayMetrics = this.d.getResources().getDisplayMetrics();
        if (Build.VERSION.SDK_INT >= 34) {
            fA = tkl.a(f, displayMetrics);
        } else {
            float f2 = displayMetrics.density;
            fA = f2 == 0.0f ? 0.0f : f / f2;
        }
        return (int) Math.ceil(fA);
    }

    @Override // defpackage.wdp
    /* renamed from: a */
    public final lw0 mo15a() {
        return lw0.AD_SIZE;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // defpackage.wdp
    public final java.lang.Object d(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r32v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */
}
