package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.opera.hype.image.editor.EditImage;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ft7 extends GestureDetector.SimpleOnGestureListener implements GestureDetector.OnGestureListener {
    public static final /* synthetic */ xtb[] h = {new pee(ft7.class, "target", "getTarget()Lcom/opera/hype/image/editor/EditImage$TouchTarget;", 0)};
    public final Rect a = new Rect();
    public final Matrix b = new Matrix();
    public final float[] c = {0.0f};
    public final float d = 1.5f;
    public final int e;
    public final et7 f;
    public final /* synthetic */ EditImage g;

    public ft7(EditImage editImage) {
        this.g = editImage;
        this.e = (int) TypedValue.applyDimension(1, 80.0f, editImage.getResources().getDisplayMetrics());
        this.f = new et7(editImage);
    }

    public final ht7 a(MotionEvent motionEvent, gt7 gt7Var, Function1 function1) {
        bfl bflVarB = b(motionEvent, function1);
        if (bflVarB == null) {
            return null;
        }
        EditImage editImage = this.g;
        editImage.c(Intrinsics.a(editImage.j, bflVarB), true);
        bflVarB.f.performHapticFeedback(1);
        return new ht7(bflVarB, (View) function1.invoke(bflVarB), gt7Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bfl b(android.view.MotionEvent r19, kotlin.jvm.functions.Function1 r20) {
        /*
            r18 = this;
            r0 = r18
            com.opera.hype.image.editor.EditImage r1 = r0.g
            v39 r1 = r1.f()
            u39 r2 = new u39
            r2.<init>(r1)
            r1 = 0
        Le:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9a
            java.lang.Object r3 = r2.next()
            r4 = r3
            bfl r4 = (defpackage.bfl) r4
            r5 = r20
            java.lang.Object r6 = r5.invoke(r4)
            android.view.View r6 = (android.view.View) r6
            if (r6 != 0) goto L27
            r4 = 0
            goto L95
        L27:
            android.graphics.Rect r7 = r0.a
            r6.getHitRect(r7)
            com.opera.hype.image.editor.TextBoxFrame r4 = r4.e
            boolean r6 = kotlin.jvm.internal.Intrinsics.a(r4, r6)
            if (r6 != 0) goto L87
            android.graphics.Matrix r6 = r4.getMatrix()
            android.graphics.Matrix r8 = r0.b
            boolean r6 = r6.invert(r8)
            if (r6 == 0) goto L87
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            float r6 = r19.getX()
            int r9 = r4.leftMargin
            float r9 = (float) r9
            float r15 = r6 - r9
            float r6 = r19.getY()
            int r4 = r4.topMargin
            float r4 = (float) r4
            float r16 = r6 - r4
            long r10 = r19.getDownTime()
            long r12 = r19.getEventTime()
            int r14 = r19.getAction()
            int r17 = r19.getMetaState()
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r10, r12, r14, r15, r16, r17)
            r4.transform(r8)     // Catch: java.lang.Throwable -> L82
            float r6 = r4.getX()     // Catch: java.lang.Throwable -> L82
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L82
            float r8 = r4.getY()     // Catch: java.lang.Throwable -> L82
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L82
            boolean r6 = r7.contains(r6, r8)     // Catch: java.lang.Throwable -> L82
            r4.recycle()
            r4 = r6
            goto L95
        L82:
            r0 = move-exception
            r4.recycle()
            throw r0
        L87:
            float r4 = r19.getX()
            int r4 = (int) r4
            float r6 = r19.getY()
            int r6 = (int) r6
            boolean r4 = r7.contains(r4, r6)
        L95:
            if (r4 == 0) goto Le
            r1 = r3
            goto Le
        L9a:
            bfl r1 = (defpackage.bfl) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft7.b(android.view.MotionEvent, kotlin.jvm.functions.Function1):bfl");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        gt7 gt7Var = gt7.c;
        ht7 ht7VarA = a(motionEvent, gt7Var, new m57((byte) 20));
        if (ht7VarA == null && (ht7VarA = a(motionEvent, gt7Var, new m57((byte) 21))) == null && (ht7VarA = a(motionEvent, gt7Var, new m57((byte) 22))) == null && (ht7VarA = a(motionEvent, gt7Var, new m57((byte) 23))) == null) {
            m57 m57Var = new m57((byte) 24);
            gt7 gt7Var2 = gt7.b;
            ht7 ht7VarA2 = a(motionEvent, gt7Var2, m57Var);
            if (ht7VarA2 == null && (ht7VarA2 = a(motionEvent, gt7Var2, new m57((byte) 25))) == null) {
                ht7VarA = a(motionEvent, gt7Var2, new m57((byte) 26));
                if (ht7VarA == null) {
                    return super.onDown(motionEvent);
                }
            } else {
                ht7VarA = ht7VarA2;
            }
        }
        this.f.g(h[0], ht7VarA);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        xtb[] xtbVarArr = h;
        xtb xtbVar = xtbVarArr[0];
        et7 et7Var = this.f;
        if (((ht7) et7Var.b) != null) {
            return;
        }
        et7Var.g(xtbVarArr[0], a(motionEvent, gt7.a, new m57((byte) 19)));
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        bfl bflVarB = b(motionEvent, new m57((byte) 18));
        EditImage editImage = this.g;
        if (bflVarB != null) {
            if (bflVarB != editImage.j) {
                editImage.a(bflVarB, false);
                return true;
            }
        } else {
            if (editImage.c(true, false)) {
                return true;
            }
            ba3.i.getClass();
            PointF pointF = new PointF(0.5f, 0.5f);
            bpd bpdVar = editImage.g;
            i97 i97Var = (i97) bpdVar.c;
            if (i97Var.c((EditImage) bpdVar.b)) {
                pointF.set(i97Var.b(motionEvent.getX(), motionEvent.getY()));
            }
            qq6 qq6Var = editImage.m;
            if (qq6Var != null) {
                lxa lxaVarG0 = ((ywa) qq6Var.b).g0();
                List list = lxaVarG0.f;
                nak nakVar = lxaVarG0.n;
                if (CollectionsKt.E(list, nakVar.getValue())) {
                    nsl nslVar = (nsl) nakVar.getValue();
                    int i = nslVar == null ? -1 : jxa.a[nslVar.ordinal()];
                    if (i == 1) {
                        lxaVarG0.f(new dxa(pointF, 2));
                        return true;
                    }
                    if (i == 2) {
                        lxaVarG0.f(new hxa(pointF));
                        return true;
                    }
                    if (i == 3) {
                        lxaVarG0.f(new dxa(pointF, true));
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
