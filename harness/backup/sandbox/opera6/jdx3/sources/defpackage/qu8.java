package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final class qu8 implements k7j, q8j {
    public final /* synthetic */ byte a = 1;
    public final isd b;
    public boolean c;
    public final /* synthetic */ t7j d;

    public qu8(ore oreVar, isd isdVar) {
        this.d = oreVar;
        this.b = isdVar;
        oreVar.j.b(this);
    }

    public qu8(ru8 ru8Var, isd isdVar) {
        this.d = ru8Var;
        this.b = isdVar;
        ru8Var.l.b(this);
    }

    @Override // defpackage.q8j
    public final void a() {
        byte b = this.a;
        t7j t7jVar = this.d;
        switch (b) {
            case 0:
                ru8 ru8Var = (ru8) t7jVar;
                ta7 ta7Var = ru8Var.j;
                ta7Var.s().edit().remove("duration_threshold").remove("percent_threshold").remove("enable_local_push").remove("enable_native_push").remove("enable_video_theater").apply();
                s6h s6hVar = (s6h) ta7Var.e;
                s6hVar.getClass();
                ((i32) s6hVar.a).f(new cn7(s6hVar, new ux8(null, null), (byte) 21));
                ru8Var.c();
                break;
            default:
                ((ore) t7jVar).c();
                break;
        }
    }

    @Override // defpackage.k7j
    public final void b() {
        switch (this.a) {
            case 0:
                this.c = true;
                break;
            default:
                this.c = true;
                break;
        }
    }

    @Override // defpackage.q8j
    public final void c(Object obj) {
        pu8 pu8VarP;
        switch (this.a) {
            case 0:
                qtm qtmVar = (qtm) obj;
                ru8 ru8Var = (ru8) this.d;
                if (qtmVar != null) {
                    ru8Var.m = qtmVar;
                    if (!ru8Var.n && (pu8VarP = ru8Var.j.p()) != null) {
                        d(pu8VarP);
                        break;
                    } else {
                        qtm qtmVar2 = ru8Var.m;
                        if (qtmVar2 == null) {
                            d(null);
                            break;
                        } else {
                            s9i s9iVar = ru8Var.k;
                            mp4 mp4Var = new mp4((Context) s9iVar.b, (ywh) s9iVar.c, qtmVar2);
                            Uri.Builder builderC = mp4Var.c();
                            builderC.appendEncodedPath("v1/config/feed");
                            z7 z7Var = new z7(builderC.build().toString());
                            z7Var.f = true;
                            mp4Var.e.a(z7Var, new kp4(mp4Var, this, (byte) 1));
                            break;
                        }
                    }
                } else {
                    d(null);
                    break;
                }
                break;
            default:
                z05 z05Var = (z05) obj;
                if (!this.c) {
                    nre nreVar = z05Var != null ? new nre(z05Var) : null;
                    isd isdVar = this.b;
                    isdVar.getClass();
                    isdVar.E(nreVar, nreVar != null);
                    break;
                }
                break;
        }
    }

    public final void d(pu8 pu8Var) {
        if (this.c) {
            return;
        }
        ((ru8) this.d).n = false;
        isd isdVar = this.b;
        isdVar.getClass();
        isdVar.E(pu8Var, pu8Var != null);
    }
}
