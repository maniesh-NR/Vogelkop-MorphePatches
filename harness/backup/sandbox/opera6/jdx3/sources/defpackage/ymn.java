package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.CircleImageView;
import com.opera.android.settings.SettingsManager;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ymn extends bmn {
    public static xq3 n;
    public final SettingsManager j;
    public final umn k;
    public final String l;
    public final g7j m;

    public ymn(qln qlnVar, x5f x5fVar, SettingsManager settingsManager, eej eejVar, d8j d8jVar, umn umnVar, gjm gjmVar) {
        super(0, qlnVar, x5fVar, eejVar, gjmVar);
        this.j = settingsManager;
        this.k = umnVar;
        this.l = qlnVar.i();
        this.m = settingsManager.g();
    }

    @Override // defpackage.bmn
    public final FrameLayout b(Context context, qf qfVar, jvg jvgVar) {
        umn umnVar = this.k;
        xmn xmnVar = umnVar.k;
        View viewInflate = LayoutInflater.from(context).inflate(2131559546, (ViewGroup) null, false);
        int i = 2131362100;
        CircleImageView circleImageView = (CircleImageView) w1h.j(2131362100, viewInflate);
        if (circleImageView != null) {
            i = 2131362101;
            FrameLayout frameLayout = (FrameLayout) w1h.j(2131362101, viewInflate);
            if (frameLayout != null) {
                i = 2131362240;
                View viewJ = w1h.j(2131362240, viewInflate);
                if (viewJ != null) {
                    pq3 pq3VarA = pq3.a(viewJ);
                    MaterialButton materialButton = pq3VarA.c;
                    MaterialButton materialButton2 = pq3VarA.d;
                    int i2 = 2131363509;
                    TextView textView = (TextView) w1h.j(2131363509, viewInflate);
                    if (textView != null) {
                        i2 = 2131364032;
                        RecyclerView recyclerView = (RecyclerView) w1h.j(2131364032, viewInflate);
                        if (recyclerView != null) {
                            i2 = 2131364107;
                            if (((LinearLayout) w1h.j(2131364107, viewInflate)) != null) {
                                i2 = 2131364140;
                                if (w1h.j(2131364140, viewInflate) != null) {
                                    FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                                    i2 = 2131363525;
                                    TextView textView2 = (TextView) w1h.j(2131363525, viewInflate);
                                    if (textView2 != null) {
                                        g7d g7dVar = new g7d(pq3VarA, frameLayout2, frameLayout, textView, textView2, recyclerView, circleImageView);
                                        String string = umnVar.b;
                                        if (string == null) {
                                            string = context.getString(xmnVar.a);
                                        }
                                        textView2.setText(string);
                                        String string2 = umnVar.c;
                                        if (string2 == null) {
                                            string2 = context.getString(xmnVar.b);
                                        }
                                        textView.setText(string2);
                                        a(recyclerView, jvgVar);
                                        String string3 = umnVar.d;
                                        if (string3 == null) {
                                            string3 = context.getString(2132018586);
                                        }
                                        materialButton2.setText(string3);
                                        materialButton2.setOnClickListener(new lk5(jvgVar, (byte) 2));
                                        String string4 = umnVar.e;
                                        if (string4 == null) {
                                            string4 = context.getString(2132018460);
                                        }
                                        materialButton.setText(string4);
                                        materialButton.setOnClickListener(new lk5(jvgVar, (byte) 3));
                                        if (umnVar.h) {
                                            textView2.setTextAlignment(4);
                                            textView.setTextAlignment(4);
                                        }
                                        if (umnVar.f != null) {
                                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView2.getLayoutParams();
                                            layoutParams.topMargin = fan.a(48.0f, context.getResources());
                                            textView2.setLayoutParams(layoutParams);
                                            frameLayout.setVisibility(0);
                                            vs5 vs5Var = new vs5(this, context, g7dVar, (byte) 5);
                                            q9n.e(frameLayout, vs5Var);
                                            vs5Var.a(frameLayout);
                                        }
                                        return frameLayout2;
                                    }
                                }
                            }
                        }
                    }
                    i = i2;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.bmn
    public final List d() {
        qln qlnVar = this.b;
        String strI = qlnVar.i();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(strI);
        for (String str : this.k.a) {
            if (!Intrinsics.a(str, strI)) {
                linkedHashSet.add(str);
            }
        }
        return qlnVar.k(linkedHashSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r2 != (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        r7.U(r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        r8 = (defpackage.g7j) r1.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r8 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r3 == r7.g()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        r7.U(r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    @Override // defpackage.bmn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.String r8) {
        /*
            r7 = this;
            super.e(r8)
            umn r0 = r7.k
            java.util.ArrayList r1 = r0.j
            java.util.LinkedHashSet r0 = r0.a
            if (r1 == 0) goto L61
            int r2 = r1.size()
            int r3 = r0.size()
            if (r2 != r3) goto L61
            java.lang.String r2 = r7.l
            boolean r2 = r8.equals(r2)
            g7j r3 = r7.m
            r4 = 0
            com.opera.android.settings.SettingsManager r7 = r7.j
            if (r2 == 0) goto L26
            r7.U(r3, r4)
            return
        L26:
            java.util.Iterator r0 = r0.iterator()
            r2 = r4
        L2b:
            boolean r5 = r0.hasNext()
            r6 = -1
            if (r5 == 0) goto L48
            java.lang.Object r5 = r0.next()
            if (r2 < 0) goto L43
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = kotlin.jvm.internal.Intrinsics.a(r5, r8)
            if (r5 != 0) goto L49
            int r2 = r2 + 1
            goto L2b
        L43:
            j95.n()
            r7 = 0
            throw r7
        L48:
            r2 = r6
        L49:
            if (r2 != r6) goto L4f
            r7.U(r3, r4)
            return
        L4f:
            java.lang.Object r8 = r1.get(r2)
            g7j r8 = (defpackage.g7j) r8
            if (r8 == 0) goto L58
            r3 = r8
        L58:
            g7j r8 = r7.g()
            if (r3 == r8) goto L61
            r7.U(r3, r4)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ymn.e(java.lang.String):void");
    }

    @Override // defpackage.bmn
    public final void g(View view, qf qfVar) {
        String str = this.k.i;
        if (str == null) {
            super.g(view, qfVar);
            return;
        }
        f(ru0.f, str);
        qfVar.b();
        lk6.a(Uri.parse(str), lqm.p, 2, view.getContext());
    }
}
