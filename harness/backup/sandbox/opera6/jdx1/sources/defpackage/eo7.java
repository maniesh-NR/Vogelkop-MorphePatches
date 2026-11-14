package defpackage;

import android.os.SystemClock;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class eo7 implements dx7 {
    public final /* synthetic */ byte a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public Object f;
    public Object g;

    public eo7() {
        this.a = (byte) 1;
        this.f = new g1g(10);
        this.c = -9223372036854775807L;
    }

    public eo7(List list) {
        this.a = (byte) 0;
        this.f = list;
        this.g = new hyl[list.size()];
        this.c = -9223372036854775807L;
    }

    public eo7(tah tahVar) {
        this.a = (byte) 2;
        this.g = tahVar;
    }

    @Override // defpackage.dx7
    public final void a(g1g g1gVar) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (g1gVar.a() == 0) {
                            z2 = false;
                        } else {
                            if (g1gVar.A() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (g1gVar.a() == 0) {
                            z = false;
                        } else {
                            if (g1gVar.A() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                        }
                    }
                    int i = g1gVar.b;
                    int iA = g1gVar.a();
                    for (hyl hylVar : (hyl[]) this.g) {
                        g1gVar.N(i);
                        hylVar.f(iA, g1gVar);
                    }
                    this.e += iA;
                    break;
                }
                break;
            default:
                g1g g1gVar2 = (g1g) this.f;
                ((hyl) this.g).getClass();
                if (this.b) {
                    int iA2 = g1gVar.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iA2, 10 - i2);
                        System.arraycopy(g1gVar.a, g1gVar.b, g1gVar2.a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            g1gVar2.N(0);
                            if (73 != g1gVar2.A() || 68 != g1gVar2.A() || 51 != g1gVar2.A()) {
                                w7d.K("Discarding invalid ID3 tag");
                                this.b = false;
                                break;
                            } else {
                                g1gVar2.O(3);
                                this.d = g1gVar2.z() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.d - this.e);
                    ((hyl) this.g).f(iMin2, g1gVar);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.dx7
    public final void b(boolean z) {
        int i;
        switch (this.a) {
            case 0:
                if (this.b) {
                    z4o.H(this.c != -9223372036854775807L);
                    for (hyl hylVar : (hyl[]) this.g) {
                        hylVar.a(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                ((hyl) this.g).getClass();
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    z4o.H(this.c != -9223372036854775807L);
                    ((hyl) this.g).a(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.dx7
    public final void c(en8 en8Var, s7m s7mVar) {
        switch (this.a) {
            case 0:
                hyl[] hylVarArr = (hyl[]) this.g;
                for (int i = 0; i < hylVarArr.length; i++) {
                    q7m q7mVar = (q7m) ((List) this.f).get(i);
                    s7mVar.a();
                    s7mVar.b();
                    hyl hylVarTrack = en8Var.track(s7mVar.d, 3);
                    nj9 nj9Var = new nj9();
                    s7mVar.b();
                    nj9Var.a = s7mVar.e;
                    nj9Var.l = dzd.p("video/mp2t");
                    nj9Var.m = dzd.p("application/dvbsubs");
                    nj9Var.p = Collections.singletonList(q7mVar.b);
                    nj9Var.d = q7mVar.a;
                    z1m.q(nj9Var, hylVarTrack);
                    hylVarArr[i] = hylVarTrack;
                }
                break;
            default:
                s7mVar.a();
                s7mVar.b();
                hyl hylVarTrack2 = en8Var.track(s7mVar.d, 5);
                this.g = hylVarTrack2;
                nj9 nj9Var2 = new nj9();
                s7mVar.b();
                nj9Var2.a = s7mVar.e;
                nj9Var2.l = dzd.p("video/mp2t");
                nj9Var2.m = dzd.p("application/id3");
                z1m.q(nj9Var2, hylVarTrack2);
                break;
        }
    }

    @Override // defpackage.dx7
    public final void d(int i, long j) {
        int i2 = i & 4;
        switch (this.a) {
            case 0:
                if (i2 != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if (i2 != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    public final void e() {
        long duration;
        tah tahVar = (tah) this.g;
        dql dqlVar = (dql) tahVar.f;
        szk szkVar = (szk) tahVar.g;
        qi8 qi8Var = (qi8) tahVar.c;
        gql currentTimeline = qi8Var.getCurrentTimeline();
        Object objL = currentTimeline.p() ? null : currentTimeline.l(qi8Var.getCurrentPeriodIndex());
        int currentAdGroupIndex = qi8Var.getCurrentAdGroupIndex();
        int currentAdIndexInAdGroup = qi8Var.getCurrentAdIndexInAdGroup();
        long currentPosition = qi8Var.getCurrentPosition();
        if (objL == null || currentAdGroupIndex != -1) {
            duration = currentAdGroupIndex != -1 ? qi8Var.getDuration() : -9223372036854775807L;
        } else {
            currentTimeline.g(objL, dqlVar);
            currentPosition -= tym.c0(dqlVar.e);
            duration = tym.c0(dqlVar.d);
        }
        boolean zE0 = qi8Var.e0();
        if (!zE0 || duration == -9223372036854775807L || currentPosition < duration) {
            szkVar.d(3);
            if (zE0 && duration != -9223372036854775807L) {
                szkVar.a.sendEmptyMessageDelayed(3, (int) Math.ceil((duration - currentPosition) / qi8Var.getPlaybackParameters().a));
            }
            this.b = false;
            return;
        }
        ((kzk) tahVar.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b && Objects.equals(objL, this.f) && currentAdGroupIndex == this.d && currentAdIndexInAdGroup == this.e) {
            if (jElapsedRealtime - this.c >= 60000) {
                ((mi8) tahVar.b).a.T0(zh8.h(1003, new kjk(3, 60000)));
                return;
            }
            return;
        }
        this.b = true;
        this.c = jElapsedRealtime;
        this.f = objL;
        this.d = currentAdGroupIndex;
        this.e = currentAdIndexInAdGroup;
        szkVar.d(3);
        szkVar.a.sendEmptyMessageDelayed(3, 60000L);
    }

    @Override // defpackage.dx7
    public final void seek() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }
}
