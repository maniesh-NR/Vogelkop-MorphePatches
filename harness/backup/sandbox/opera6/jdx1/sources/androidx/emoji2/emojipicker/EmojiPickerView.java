package androidx.emoji2.emojipicker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.c82;
import defpackage.d7h;
import defpackage.dq2;
import defpackage.jy7;
import defpackage.ky7;
import defpackage.lph;
import defpackage.lz7;
import defpackage.m5n;
import defpackage.n9a;
import defpackage.nlb;
import defpackage.nz7;
import defpackage.o14;
import defpackage.ofg;
import defpackage.pph;
import defpackage.r5n;
import defpackage.ro9;
import defpackage.rp4;
import defpackage.ry7;
import defpackage.ukb;
import defpackage.xy7;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/emoji2/emojipicker/EmojiPickerView;", "Landroid/widget/FrameLayout;", "emoji2-emojipicker"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmojiPickerView extends FrameLayout {
    public static boolean l;
    public final Float a;
    public int b;
    public final d7h c;
    public final a64 d;
    public final f1p e;
    public boolean f;
    public final ArrayList g;
    public ukb h;
    public c82 i;
    public jy7 j;
    public ip1 k;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EmojiPickerView(@org.jetbrains.annotations.NotNull android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            r0 = 0
            r6.<init>(r7, r8, r0)
            r1 = 9
            r6.b = r1
            d7h r2 = new d7h
            r2.<init>(r7)
            r6.c = r2
            kotlin.coroutines.h r2 = kotlin.coroutines.h.a
            a64 r2 = defpackage.sgb.b(r2)
            r6.d = r2
            f1p r3 = new f1p
            r4 = 12
            r3.<init>(r7, r4)
            r6.e = r3
            r3 = 1
            r6.f = r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6.g = r4
            int[] r4 = defpackage.vhh.a
            android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r4, r0, r0)
            boolean r4 = r8.hasValue(r3)
            r5 = 0
            if (r4 == 0) goto L41
            r4 = 0
            float r4 = r8.getFloat(r3, r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L42
        L41:
            r4 = r5
        L42:
            r6.a = r4
            int r0 = r8.getInt(r0, r1)
            r6.c(r0)
            r8.recycle()
            boolean r8 = defpackage.xx7.e()
            if (r8 == 0) goto L73
            xx7 r8 = defpackage.xx7.a()
            int r8 = r8.c()
            if (r8 == 0) goto L67
            if (r8 == r3) goto L64
            r0 = 3
            if (r8 == r0) goto L67
            goto L73
        L64:
            androidx.emoji2.emojipicker.EmojiPickerView.l = r3
            goto L73
        L67:
            xx7 r8 = defpackage.xx7.a()
            kr6 r0 = new kr6
            r0.<init>(r6, r7, r3)
            r8.l(r0)
        L73:
            cv6 r8 = bb7.a
            mr6 r8 = mr6.b
            hz1 r0 = new hz1
            r0.<init>(r6, r7, r5)
            r6 = 2
            defpackage.na2.B(r2, r8, r5, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.emojipicker.EmojiPickerView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final c82 a() {
        ehc ehcVarB = a.b();
        ukb ukbVar = new ukb(2131233100, new rp4(getContext().getString(2132018816)), this.g, Integer.valueOf(this.b * 3), new ofg(getContext().getString(2132018821)));
        this.h = ukbVar;
        ehcVarB.add(ukbVar);
        List<o14> list = n9a.d;
        if (list == null) {
            qp2.n("BundledEmojiListLoader.load is not called or complete");
            return null;
        }
        int i = 0;
        for (o14 o14Var : list) {
            int i2 = i + 1;
            int i3 = o14Var.a;
            rp4 rp4Var = new rp4(o14Var.b);
            List list2 = o14Var.c;
            ArrayList arrayList = new ArrayList(k95.o(list2, 10));
            int i4 = 0;
            for (Object obj : list2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    j95.n();
                    throw null;
                }
                String str = ((nz7) obj).a;
                String str2 = (String) ((Map) ((zyk) this.c.c).getValue()).get(str);
                if (str2 != null) {
                    str = str2;
                }
                arrayList.add(new lz7(str, i4 + i, 2));
                i4 = i5;
            }
            ehcVarB.add(new ukb(i3, rp4Var, arrayList, null, null));
            i = i2;
        }
        return new c82(a.a(ehcVarB));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            yt7.k("Adding views to the EmojiPickerView is unsupported");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            yt7.k("Adding views to the EmojiPickerView is unsupported");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i, i2);
        } else {
            yt7.k("Adding views to the EmojiPickerView is unsupported");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            yt7.k("Adding views to the EmojiPickerView is unsupported");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            yt7.k("Adding views to the EmojiPickerView is unsupported");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (defpackage.na2.Z(r5, r6, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(nt5 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.uy7
            if (r0 == 0) goto L13
            r0 = r8
            uy7 r0 = (defpackage.uy7) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            uy7 r0 = new uy7
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.ybh.y(r8)
            goto L6d
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r3
        L31:
            int r2 = r0.t
            defpackage.ybh.y(r8)
            goto L59
        L37:
            defpackage.ybh.y(r8)
            boolean r8 = r7.f
            if (r8 != 0) goto L41
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L41:
            ukb r8 = r7.h
            if (r8 == 0) goto L4b
            int r8 = r8.b()
        L49:
            r2 = r8
            goto L4d
        L4b:
            r8 = 0
            goto L49
        L4d:
            r0.t = r2
            r0.w = r5
            f1p r8 = r7.e
            java.lang.Object r8 = r8.a
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == r1) goto L6c
        L59:
            java.util.List r8 = (java.util.List) r8
            cv6 r5 = bb7.a
            d7a r5 = s6d.a
            vy7 r6 = new vy7
            r6.<init>(r7, r8, r2, r3)
            r0.w = r4
            java.lang.Object r7 = defpackage.na2.Z(r5, r6, r0)
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.emojipicker.EmojiPickerView.b(nt5):java.lang.Object");
    }

    public final void c(int i) {
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        this.b = numValueOf != null ? numValueOf.intValue() : 9;
        if (isLaidOut()) {
            d();
        }
    }

    public final void d() {
        this.i = a();
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.b, 1);
        gridLayoutManager.g = new dq2(this);
        Context context = getContext();
        c82 c82Var = this.i;
        if (c82Var == null) {
            c82Var = null;
        }
        ky7 ky7Var = new ky7(context, c82Var, new ry7(this, gridLayoutManager, (byte) 0));
        super.removeAllViews();
        View viewInflate = View.inflate(getContext(), 2131558682, this);
        WeakHashMap weakHashMap = r5n.a;
        RecyclerView recyclerView = (RecyclerView) ((View) m5n.f(viewInflate, 2131362669));
        recyclerView.getContext();
        recyclerView.C0(new LinearLayoutManager() { // from class: androidx.emoji2.emojipicker.EmojiPickerView$showEmojiPickerView$1$1$1
            {
                super(0, false);
            }

            @Override // androidx.recyclerview.widget.f
            public final boolean checkLayoutParams(lph lphVar) {
                int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
                c82 c82Var2 = this.a.i;
                if (c82Var2 == null) {
                    c82Var2 = null;
                }
                ((ViewGroup.MarginLayoutParams) lphVar).width = width / ((ehc) c82Var2.b).d();
                return true;
            }
        });
        recyclerView.y0(ky7Var);
        RecyclerView recyclerView2 = (RecyclerView) ((View) m5n.f(viewInflate, 2131362667));
        recyclerView2.C0(gridLayoutManager);
        jy7 jy7Var = new jy7(getContext(), this.b, this.a, this.c, new al7(this, (byte) 2), new whf(this, (byte) 23));
        jy7Var.setHasStableIds(true);
        this.j = jy7Var;
        recyclerView2.y0(jy7Var);
        recyclerView2.o(new xy7(ky7Var, this, gridLayoutManager));
        recyclerView2.B0(null);
        ro9 ro9Var = new ro9((byte) 28);
        nlb nlbVar = nlb.a;
        pph pphVarU = ro9Var.u(2);
        pphVarU.b = (byte) 100;
        ArrayList arrayList = pphVarU.a;
        while (arrayList.size() > 100) {
            arrayList.remove(arrayList.size() - 1);
        }
        recyclerView2.D0(ro9Var);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        throw new UnsupportedOperationException("Removing views from the EmojiPickerView is unsupported");
    }
}
