package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class nmd extends zp1 {
    public static final da y = new da(7);
    public final dod g;
    public final lmd h;
    public vnd i;
    public ArrayList j;
    public TextView k;
    public TextView l;
    public RelativeLayout m;
    public TextView n;
    public TextView o;
    public LinearLayout p;
    public Button q;
    public ProgressBar r;
    public ListView s;
    public mmd t;
    public final up1 u;
    public boolean v;
    public long w;
    public final ue2 x;

    /* JADX WARN: Illegal instructions before constructor call */
    public nmd(Context context, int i) {
        ContextThemeWrapper contextThemeWrapperY = o0g.y(context, i, false);
        int iY = o0g.Y(2130970333, contextThemeWrapperY);
        super(contextThemeWrapperY, iY == 0 ? o0g.W(contextThemeWrapperY) : iY);
        this.i = vnd.c;
        this.x = new ue2(this, (byte) 7);
        this.g = dod.d(getContext());
        this.h = new lmd(this, (byte) 1);
        this.u = new up1(this, (byte) 9);
    }

    @Override // defpackage.zp1, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.u);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void f(List list) {
        this.w = SystemClock.uptimeMillis();
        this.j.clear();
        this.j.addAll(list);
        this.t.notifyDataSetChanged();
        ue2 ue2Var = this.x;
        ue2Var.removeMessages(3);
        ue2Var.removeMessages(2);
        if (!list.isEmpty()) {
            j(1);
        } else {
            j(0);
            ue2Var.sendMessageDelayed(ue2Var.obtainMessage(2), 5000L);
        }
    }

    public final void g() {
        if (this.v) {
            this.g.getClass();
            ArrayList arrayList = new ArrayList(dod.f());
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                cod codVar = (cod) arrayList.get(i);
                if (codVar.d() || !codVar.g || !codVar.h(this.i)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, yg9.d);
            if (SystemClock.uptimeMillis() - this.w >= 300) {
                f(arrayList);
                return;
            }
            ue2 ue2Var = this.x;
            ue2Var.removeMessages(1);
            ue2Var.sendMessageAtTime(ue2Var.obtainMessage(1, arrayList), this.w + 300);
        }
    }

    public final void h(vnd vndVar) {
        if (vndVar == null) {
            qp2.o("selector must not be null");
            return;
        }
        if (this.i.equals(vndVar)) {
            return;
        }
        this.i = vndVar;
        if (this.v) {
            dod dodVar = this.g;
            lmd lmdVar = this.h;
            dodVar.j(lmdVar);
            dodVar.a(vndVar, lmdVar, 1);
        }
        g();
    }

    public final void j(int i) {
        if (i == 0) {
            setTitle(2132019823);
            this.s.setVisibility(8);
            this.l.setVisibility(0);
            this.r.setVisibility(0);
            this.p.setVisibility(8);
            this.q.setVisibility(8);
            this.o.setVisibility(8);
            this.m.setVisibility(8);
            return;
        }
        if (i == 1) {
            setTitle(2132019823);
            this.s.setVisibility(0);
            this.l.setVisibility(8);
            this.r.setVisibility(8);
            this.p.setVisibility(8);
            this.q.setVisibility(8);
            this.o.setVisibility(8);
            this.m.setVisibility(8);
            return;
        }
        if (i == 2) {
            setTitle(2132019823);
            this.s.setVisibility(8);
            this.l.setVisibility(8);
            this.r.setVisibility(0);
            this.p.setVisibility(8);
            this.q.setVisibility(8);
            this.o.setVisibility(4);
            this.m.setVisibility(0);
            return;
        }
        if (i != 3) {
            return;
        }
        setTitle(2132019831);
        this.s.setVisibility(8);
        this.l.setVisibility(8);
        this.r.setVisibility(8);
        this.p.setVisibility(0);
        this.q.setVisibility(0);
        this.o.setVisibility(0);
        this.m.setVisibility(0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v = true;
        this.g.a(this.i, this.h, 1);
        g();
        ue2 ue2Var = this.x;
        ue2Var.removeMessages(2);
        ue2Var.removeMessages(3);
        ue2Var.removeMessages(1);
        ue2Var.sendMessageDelayed(ue2Var.obtainMessage(2), 5000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    @Override // defpackage.zp1, defpackage.ce5, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmd.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.v = false;
        this.g.j(this.h);
        ue2 ue2Var = this.x;
        ue2Var.removeMessages(1);
        ue2Var.removeMessages(2);
        ue2Var.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.zp1, android.app.Dialog
    public final void setTitle(int i) {
        this.k.setText(i);
    }

    @Override // defpackage.zp1, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.k.setText(charSequence);
    }
}
