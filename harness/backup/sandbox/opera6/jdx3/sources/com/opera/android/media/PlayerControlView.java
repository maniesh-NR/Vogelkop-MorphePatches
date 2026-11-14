package com.opera.android.media;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.jld;
import defpackage.kig;
import defpackage.mig;
import defpackage.vl9;
import defpackage.wkd;

/* loaded from: classes.dex */
public class PlayerControlView extends LinearLayout implements View.OnClickListener {
    public wkd a;
    public final mig b;
    public final vl9 c;

    public PlayerControlView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new mig(new jld(this, (byte) 1));
        this.c = new vl9(this, (byte) 23);
    }

    public final void a(boolean z) {
        this.a.q.setVisibility(z ? 8 : 0);
        this.a.n.setVisibility(z ? 8 : 0);
        this.a.f.setVisibility(z ? 0 : 8);
        this.a.d.setVisibility(z ? 0 : 8);
        this.a.m.setVisibility(z ? 0 : 8);
        this.a.l.setVisibility(z ? 0 : 8);
        this.a.r.setVisibility(z ? 8 : 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        postDelayed(this.c, 1800L);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mig migVar = this.b;
        if (migVar.a != null) {
            if (view.getId() == 2131363902) {
                migVar.e();
                return;
            }
            if (view.getId() == 2131363989) {
                migVar.c().p0();
                return;
            }
            if (view.getId() == 2131363990) {
                if (migVar.c().getPlaybackState() != 4) {
                    migVar.c().o0();
                    return;
                }
                return;
            }
            if (view.getId() == 2131364825) {
                migVar.c().r();
                return;
            }
            if (view.getId() == 2131364824) {
                migVar.c().M();
                return;
            }
            int i = 1;
            if (view.getId() == 2131363906 || view.getId() == 2131363907) {
                migVar.c().setShuffleModeEnabled(!migVar.c().getShuffleModeEnabled());
                return;
            }
            if (view.getId() == 2131363904 || view.getId() == 2131363905) {
                gig gigVarC = migVar.c();
                int repeatMode = migVar.c().getRepeatMode();
                if (repeatMode == 0) {
                    i = 2;
                } else if (repeatMode != 2) {
                    i = 0;
                }
                gigVarC.setRepeatMode(i);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.c);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        wkd wkdVarA = wkd.a(this);
        this.a = wkdVarA;
        wkdVarA.t.setOnClickListener(this);
        this.a.s.setOnClickListener(this);
        this.a.h.setOnClickListener(this);
        this.a.i.setOnClickListener(this);
        this.a.b.setOnClickListener(this);
        this.a.c.setOnClickListener(this);
        this.a.d.setOnClickListener(this);
        this.a.e.setOnClickListener(this);
        this.a.f.setOnClickListener(this);
        kig kigVar = this.b.i;
        this.a.k.t0(kigVar);
        this.a.k.u0(kigVar);
        a(false);
    }
}
