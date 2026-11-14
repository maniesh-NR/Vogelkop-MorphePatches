package defpackage;

import J.N;
import android.widget.SeekBar;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.mediarouter.app.OperaMediaRouteActionProvider;
import androidx.mediarouter.app.OperaMediaRouteButton;
import androidx.mediarouter.app.d;
import androidx.mediarouter.app.e;
import java.lang.ref.WeakReference;
import java.util.Collections;
import org.chromium.components.media_router.BrowserMediaRouterDialogController;

/* loaded from: classes.dex */
public final class lmd extends wnd {
    public final /* synthetic */ byte a;
    public final Object b;

    public lmd(OperaMediaRouteActionProvider operaMediaRouteActionProvider) {
        this.a = (byte) 6;
        this.b = new WeakReference(operaMediaRouteActionProvider);
    }

    public /* synthetic */ lmd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(dod dodVar) {
        OperaMediaRouteActionProvider operaMediaRouteActionProvider = (OperaMediaRouteActionProvider) ((WeakReference) this.b).get();
        if (operaMediaRouteActionProvider != null) {
            operaMediaRouteActionProvider.h();
        } else {
            dodVar.j(this);
        }
    }

    @Override // defpackage.wnd
    public final void onProviderAdded(dod dodVar, bod bodVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((MediaRouteButton) obj).b();
                break;
            case 6:
                a(dodVar);
                break;
            case 7:
                ((OperaMediaRouteButton) obj).b();
                break;
            default:
                super.onProviderAdded(dodVar, bodVar);
                break;
        }
    }

    @Override // defpackage.wnd
    public final void onProviderChanged(dod dodVar, bod bodVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((MediaRouteButton) obj).b();
                break;
            case 6:
                a(dodVar);
                break;
            case 7:
                ((OperaMediaRouteButton) obj).b();
                break;
            default:
                super.onProviderChanged(dodVar, bodVar);
                break;
        }
    }

    @Override // defpackage.wnd
    public final void onProviderRemoved(dod dodVar, bod bodVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((MediaRouteButton) obj).b();
                break;
            case 6:
                a(dodVar);
                break;
            case 7:
                ((OperaMediaRouteButton) obj).b();
                break;
            default:
                super.onProviderRemoved(dodVar, bodVar);
                break;
        }
    }

    @Override // defpackage.wnd
    public final void onRouteAdded(dod dodVar, cod codVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((MediaRouteButton) obj).b();
                break;
            case 1:
                ((nmd) obj).g();
                break;
            case 2:
            case 3:
            default:
                super.onRouteAdded(dodVar, codVar);
                break;
            case 4:
                ((hnd) obj).f();
                break;
            case 5:
                ((ond) obj).n();
                break;
            case 6:
                a(dodVar);
                break;
            case 7:
                ((OperaMediaRouteButton) obj).b();
                break;
        }
    }

    @Override // defpackage.wnd
    public final void onRouteChanged(dod dodVar, cod codVar) {
        ynd yndVarA;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((MediaRouteButton) obj).b();
                break;
            case 1:
                ((nmd) obj).g();
                break;
            case 2:
                ((d) obj).r(true);
                break;
            case 3:
            default:
                super.onRouteChanged(dodVar, codVar);
                break;
            case 4:
                ((hnd) obj).f();
                break;
            case 5:
                ond ondVar = (ond) obj;
                if (codVar == ondVar.j) {
                    codVar.getClass();
                    if (cod.b() != null) {
                        bod bodVar = codVar.a;
                        dod.b();
                        for (cod codVar2 : Collections.unmodifiableList(bodVar.b)) {
                            if (!Collections.unmodifiableList(ondVar.j.v).contains(codVar2) && (yndVarA = ondVar.j.a()) != null && yndVarA.o(codVar2) && !ondVar.l.contains(codVar2)) {
                                ondVar.o();
                                ondVar.m();
                                break;
                            }
                        }
                    }
                }
                ondVar.n();
                break;
            case 6:
                a(dodVar);
                break;
            case 7:
                ((OperaMediaRouteButton) obj).b();
                break;
        }
    }

    @Override // defpackage.wnd
    public final void onRouteRemoved(dod dodVar, cod codVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((MediaRouteButton) obj).b();
                break;
            case 1:
                ((nmd) obj).g();
                break;
            case 2:
            case 3:
            default:
                super.onRouteRemoved(dodVar, codVar);
                break;
            case 4:
                ((hnd) obj).f();
                break;
            case 5:
                ((ond) obj).n();
                break;
            case 6:
                a(dodVar);
                break;
            case 7:
                ((OperaMediaRouteButton) obj).b();
                break;
        }
    }

    @Override // defpackage.wnd
    public final void onRouteSelected(dod dodVar, cod codVar) {
        switch (this.a) {
            case 7:
                ((OperaMediaRouteButton) this.b).b();
                break;
            default:
                super.onRouteSelected(dodVar, codVar);
                break;
        }
    }

    @Override // defpackage.wnd
    public final void onRouteSelected(dod dodVar, cod codVar, int i, cod codVar2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((MediaRouteButton) obj).b();
                break;
            case 1:
                ((nmd) obj).dismiss();
                break;
            case 2:
            case 3:
            default:
                super.onRouteSelected(dodVar, codVar, i, codVar2);
                break;
            case 4:
                ((hnd) obj).dismiss();
                break;
            case 5:
                ond ondVar = (ond) obj;
                ondVar.j = codVar;
                ondVar.o();
                ondVar.m();
                break;
        }
    }

    @Override // defpackage.wnd
    public final void onRouteUnselected(dod dodVar, cod codVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                ((d) obj).r(false);
                break;
            case 3:
                and andVar = (and) obj;
                BrowserMediaRouterDialogController browserMediaRouterDialogController = (BrowserMediaRouterDialogController) ((k73) andVar).e;
                String str = andVar.g;
                if (browserMediaRouterDialogController.b != null) {
                    browserMediaRouterDialogController.b = null;
                    N.MSLqZyD4(browserMediaRouterDialogController.a, str);
                    break;
                }
                break;
            case 7:
                ((OperaMediaRouteButton) obj).b();
                break;
            default:
                super.onRouteUnselected(dodVar, codVar);
                break;
        }
    }

    @Override // defpackage.wnd
    public final void onRouteUnselected(dod dodVar, cod codVar, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((MediaRouteButton) obj).b();
                break;
            case 5:
                ((ond) obj).n();
                break;
            default:
                super.onRouteUnselected(dodVar, codVar, i);
                break;
        }
    }

    @Override // defpackage.wnd
    public final void onRouteVolumeChanged(dod dodVar, cod codVar) {
        e eVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                d dVar = (d) obj;
                SeekBar seekBar = (SeekBar) dVar.S.get(codVar);
                int i = codVar.p;
                int i2 = d.q0;
                if (seekBar != null && dVar.N != codVar) {
                    seekBar.setProgress(i);
                    break;
                }
                break;
            case 5:
                int i3 = codVar.p;
                int i4 = ond.U;
                ond ondVar = (ond) obj;
                if (ondVar.x != codVar && (eVar = (e) ondVar.w.get(codVar.c)) != null) {
                    int i5 = eVar.b.p;
                    eVar.V(i5 == 0);
                    eVar.d.setProgress(i5);
                    break;
                }
                break;
            default:
                super.onRouteVolumeChanged(dodVar, codVar);
                break;
        }
    }

    @Override // defpackage.wnd
    public final void onRouterParamsChanged(dod dodVar, god godVar) {
        switch (this.a) {
            case 0:
                boolean z = godVar != null ? godVar.f.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
                MediaRouteButton mediaRouteButton = (MediaRouteButton) this.b;
                if (mediaRouteButton.f != z) {
                    mediaRouteButton.f = z;
                    mediaRouteButton.refreshDrawableState();
                    break;
                }
                break;
            default:
                super.onRouterParamsChanged(dodVar, godVar);
                break;
        }
    }
}
