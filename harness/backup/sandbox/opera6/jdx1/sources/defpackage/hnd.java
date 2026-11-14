package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class hnd extends zp1 {
    public final dod g;
    public final lmd h;
    public final Context i;
    public vnd j;
    public ArrayList k;
    public qt5 l;
    public RecyclerView m;
    public boolean n;
    public cod o;
    public final long p;
    public long q;
    public final ue2 r;

    /* JADX WARN: Illegal instructions before constructor call */
    public hnd(Context context) {
        ContextThemeWrapper contextThemeWrapperY = o0g.y(context, 0, false);
        int iY = o0g.Y(2130970333, contextThemeWrapperY);
        super(contextThemeWrapperY, iY == 0 ? o0g.W(contextThemeWrapperY) : iY);
        this.j = vnd.c;
        this.r = new ue2(this, (byte) 8);
        Context context2 = getContext();
        this.g = dod.d(context2);
        this.h = new lmd(this, (byte) 4);
        this.i = context2;
        this.p = context2.getResources().getInteger(2131492940);
    }

    public final void f() {
        if (this.o == null && this.n) {
            this.g.getClass();
            ArrayList arrayList = new ArrayList(dod.f());
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                cod codVar = (cod) arrayList.get(i);
                if (codVar.d() || !codVar.g || !codVar.h(this.j)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, yg9.e);
            long jUptimeMillis = SystemClock.uptimeMillis() - this.q;
            long j = this.p;
            if (jUptimeMillis < j) {
                ue2 ue2Var = this.r;
                ue2Var.removeMessages(1);
                ue2Var.sendMessageAtTime(ue2Var.obtainMessage(1, arrayList), this.q + j);
            } else {
                this.q = SystemClock.uptimeMillis();
                this.k.clear();
                this.k.addAll(arrayList);
                this.l.G();
            }
        }
    }

    public final void g(vnd vndVar) {
        if (vndVar == null) {
            qp2.o("selector must not be null");
            return;
        }
        if (this.j.equals(vndVar)) {
            return;
        }
        this.j = vndVar;
        if (this.n) {
            dod dodVar = this.g;
            lmd lmdVar = this.h;
            dodVar.j(lmdVar);
            dodVar.a(vndVar, lmdVar, 1);
        }
        f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
        this.g.a(this.j, this.h, 1);
        f();
    }

    @Override // defpackage.zp1, defpackage.ce5, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131559077);
        View decorView = getWindow().getDecorView();
        Context context = this.i;
        decorView.setBackgroundColor(context.getColor(o0g.g0(context) ? 2131101259 : 2131101258));
        this.k = new ArrayList();
        ((ImageButton) findViewById(2131363602)).setOnClickListener(new sma(this, (byte) 26));
        this.l = new qt5(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131363604);
        this.m = recyclerView;
        recyclerView.y0(this.l);
        this.m.C0(new LinearLayoutManager());
        getWindow().setLayout(!context.getResources().getBoolean(2131034127) ? -1 : wxe.B(context), context.getResources().getBoolean(2131034127) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = false;
        this.g.j(this.h);
        this.r.removeMessages(1);
    }
}
