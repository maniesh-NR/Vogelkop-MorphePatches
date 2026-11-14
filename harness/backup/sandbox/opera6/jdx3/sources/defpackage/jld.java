package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.slider.Slider;
import com.opera.android.media.PlayerControlView;

/* loaded from: classes.dex */
public final class jld implements lig {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View.OnClickListener b;

    public /* synthetic */ jld(View.OnClickListener onClickListener, byte b) {
        this.a = b;
        this.b = onClickListener;
    }

    private final void k(int i) {
    }

    private final void l(boolean z) {
    }

    private final void m(CharSequence charSequence, CharSequence charSequence2) {
    }

    @Override // defpackage.lig
    public final void b(long j) {
        byte b = this.a;
        View.OnClickListener onClickListener = this.b;
        switch (b) {
            case 0:
                rld rldVar = (rld) onClickListener;
                rldVar.m.s.setMax((int) j);
                nld nldVar = rldVar.p;
                nldVar.h.i = j;
                nldVar.j.f = j;
                break;
            default:
                ((PlayerControlView) onClickListener).a.k.D0(Math.max(1L, j));
                break;
        }
    }

    @Override // defpackage.lig
    public final void c(String str) {
        byte b = this.a;
        View.OnClickListener onClickListener = this.b;
        switch (b) {
            case 0:
                ((rld) onClickListener).m.f.setText(str);
                break;
            default:
                ((PlayerControlView) onClickListener).a.p.setText(str);
                break;
        }
    }

    @Override // defpackage.lig
    public final void d(boolean z, boolean z2) {
        byte b = this.a;
        View.OnClickListener onClickListener = this.b;
        switch (b) {
            case 0:
                rld rldVar = (rld) onClickListener;
                nld nldVar = rldVar.p;
                nldVar.m = z;
                nldVar.j.g = z;
                if (nldVar.l) {
                    nldVar.c();
                }
                rldVar.m.m.setImageResource(z ? 2131232176 : 2131232185);
                rldVar.m.m.setEnabled(z2);
                n1h.n(rldVar.m.m, z ? 2132021933 : 2132021934, 0);
                break;
            default:
                PlayerControlView playerControlView = (PlayerControlView) onClickListener;
                playerControlView.a.b.setImageResource(z ? 2131232176 : 2131232185);
                playerControlView.a.b.setEnabled(z2);
                n1h.n(playerControlView.a.b, z ? 2132021933 : 2132021934, 0);
                break;
        }
    }

    @Override // defpackage.lig
    public final void e(long j) {
        byte b = this.a;
        View.OnClickListener onClickListener = this.b;
        switch (b) {
            case 0:
                ((rld) onClickListener).m.s.setProgress((int) j);
                break;
            default:
                PlayerControlView playerControlView = (PlayerControlView) onClickListener;
                Slider slider = playerControlView.a.k;
                slider.C0(cs5.s(j, slider.w(), playerControlView.a.k.x()));
                break;
        }
    }

    @Override // defpackage.lig
    public final void f(boolean z, boolean z2) {
        byte b = this.a;
        View.OnClickListener onClickListener = this.b;
        switch (b) {
            case 0:
                rld rldVar = (rld) onClickListener;
                rldVar.m.x.setEnabled(z);
                rldVar.m.w.setEnabled(z2);
                rldVar.p.j.h = z2;
                break;
            default:
                PlayerControlView playerControlView = (PlayerControlView) onClickListener;
                playerControlView.a.t.setEnabled(z);
                playerControlView.a.s.setEnabled(z2);
                break;
        }
    }

    @Override // defpackage.lig
    public final void g(boolean z) {
        switch (this.a) {
            case 0:
                break;
            default:
                PlayerControlView playerControlView = (PlayerControlView) this.b;
                playerControlView.a.e.setActivated(z);
                playerControlView.a.f.setActivated(z);
                int i = z ? 2132021942 : 2132021941;
                n1h.n(playerControlView.a.e, i, 0);
                n1h.n(playerControlView.a.f, i, 0);
                break;
        }
    }

    @Override // defpackage.lig
    public final void h(String str) {
        byte b = this.a;
        View.OnClickListener onClickListener = this.b;
        switch (b) {
            case 0:
                ((rld) onClickListener).m.k.setText(str);
                break;
            default:
                ((PlayerControlView) onClickListener).a.o.setText(str);
                break;
        }
    }

    @Override // defpackage.lig
    public final void i(CharSequence charSequence, CharSequence charSequence2) throws Resources.NotFoundException {
        switch (this.a) {
            case 0:
                break;
            default:
                PlayerControlView playerControlView = (PlayerControlView) this.b;
                playerControlView.a.q.setText(charSequence);
                if (TextUtils.isEmpty(charSequence2)) {
                    mig migVar = playerControlView.b;
                    qjd qjdVarG = migVar.c().g();
                    egd egdVar = qjdVarG != null ? (egd) migVar.d.k.e.get(qjdVarG.a) : null;
                    if (egdVar != null && egdVar.b() == o29.AUDIO) {
                        charSequence2 = playerControlView.getResources().getString(2132022042);
                    }
                }
                playerControlView.a.n.setText(charSequence2);
                break;
        }
    }

    @Override // defpackage.lig
    public final void j(boolean z, boolean z2, boolean z3) {
        byte b = this.a;
        View.OnClickListener onClickListener = this.b;
        switch (b) {
            case 0:
                rld rldVar = (rld) onClickListener;
                rldVar.m.q.setEnabled(z2);
                rldVar.m.r.setEnabled(z3);
                rldVar.m.s.setEnabled(z);
                nld nldVar = rldVar.p;
                pld pldVar = nldVar.h;
                pldVar.f = z;
                if (!z) {
                    pldVar.g = false;
                    if (pldVar.h) {
                        ((hld) pldVar.c.b).t.setVisibility(8);
                        pldVar.h = false;
                    }
                }
                pgh pghVar = nldVar.j;
                pghVar.i = z2;
                pghVar.j = z3;
                if (!z2 && !z3) {
                    pghVar.e = 0;
                    break;
                }
                break;
            default:
                PlayerControlView playerControlView = (PlayerControlView) onClickListener;
                playerControlView.a.h.setEnabled(z2);
                playerControlView.a.i.setEnabled(z3);
                playerControlView.a.k.setEnabled(z);
                break;
        }
    }

    @Override // defpackage.lig
    public final void setRepeatMode(int i) {
        int i2;
        boolean z;
        switch (this.a) {
            case 0:
                break;
            default:
                PlayerControlView playerControlView = (PlayerControlView) this.b;
                int i3 = 2131232217;
                int i4 = 2131232216;
                if (i != 0) {
                    z = true;
                    if (i == 1) {
                        i4 = 2131232218;
                        i3 = 2131232219;
                        i2 = 2132021938;
                    } else if (i == 2) {
                        i2 = 2132021936;
                    }
                } else {
                    i2 = 2132021937;
                    z = false;
                }
                playerControlView.a.c.setActivated(z);
                playerControlView.a.c.setImageResource(i4);
                n1h.n(playerControlView.a.c, i2, 0);
                playerControlView.a.d.setActivated(z);
                playerControlView.a.d.setImageResource(i3);
                n1h.n(playerControlView.a.d, i2, 0);
                break;
        }
    }
}
