package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.ho5;
import defpackage.shh;
import defpackage.u33;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Barrier extends ho5 {
    public int h;
    public u33 i;

    public Barrier(Context context) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context);
        this.a = new int[32];
        this.g = new HashMap();
        this.c = context;
        h(null);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // defpackage.ho5
    public final void h(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.h(attributeSet);
        u33 u33Var = new u33();
        u33Var.r0 = 0;
        u33Var.s0 = true;
        u33Var.t0 = 0;
        u33Var.u0 = false;
        this.i = u33Var;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, shh.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    this.h = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.i.s0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.i.t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.i;
        o();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    @Override // defpackage.ho5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.uo5 r5, boolean r6) {
        /*
            r4 = this;
            int r4 = r4.h
            r0 = 0
            r1 = 6
            r2 = 1
            r3 = 5
            if (r6 == 0) goto Ld
            if (r4 == r3) goto L13
            if (r4 != r1) goto L14
            goto Lf
        Ld:
            if (r4 != r3) goto L11
        Lf:
            r4 = r0
            goto L14
        L11:
            if (r4 != r1) goto L14
        L13:
            r4 = r2
        L14:
            boolean r6 = r5 instanceof defpackage.u33
            if (r6 == 0) goto L1c
            u33 r5 = (defpackage.u33) r5
            r5.r0 = r4
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.j(uo5, boolean):void");
    }
}
