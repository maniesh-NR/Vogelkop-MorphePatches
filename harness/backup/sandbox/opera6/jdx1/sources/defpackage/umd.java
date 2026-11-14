package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.mediarouter.app.d;

/* loaded from: classes.dex */
public final class umd implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d b;

    public /* synthetic */ umd(d dVar, byte b) {
        this.a = b;
        this.b = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws PendingIntent.CanceledException {
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        byte b = this.a;
        int i = 0;
        d dVar = this.b;
        switch (b) {
            case 0:
                Context context = dVar.k;
                AccessibilityManager accessibilityManager = dVar.o0;
                int id = view.getId();
                if (id != 16908313 && id != 16908314) {
                    if (id != 2131363589) {
                        if (id == 2131363587) {
                            dVar.dismiss();
                            break;
                        }
                    } else {
                        z8b z8bVar = dVar.T;
                        if (z8bVar != null && (playbackStateCompat = dVar.V) != null) {
                            if (playbackStateCompat.a == 3) {
                                long j = playbackStateCompat.e;
                                if ((514 & j) != 0) {
                                    ((a) z8bVar.a).a.getTransportControls().pause();
                                    i = 2132019840;
                                } else if ((j & 1) != 0) {
                                    ((a) z8bVar.a).a.getTransportControls().stop();
                                    i = 2132019842;
                                }
                            } else if ((playbackStateCompat.e & 516) != 0) {
                                ((a) z8bVar.a).a.getTransportControls().play();
                                i = 2132019841;
                            }
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && i != 0) {
                                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
                                accessibilityEventObtain.setPackageName(context.getPackageName());
                                accessibilityEventObtain.setClassName(umd.class.getName());
                                accessibilityEventObtain.getText().add(context.getString(i));
                                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
                                break;
                            }
                        }
                    }
                } else {
                    if (dVar.j.g()) {
                        dod dodVar = dVar.h;
                        int i2 = id == 16908313 ? 2 : 1;
                        dodVar.getClass();
                        dod.n(i2);
                    }
                    dVar.dismiss();
                    break;
                }
                break;
            case 1:
                dVar.dismiss();
                break;
            case 2:
                z8b z8bVar2 = dVar.T;
                if (z8bVar2 != null && (sessionActivity = ((a) z8bVar2.a).a.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        dVar.dismiss();
                        break;
                    } catch (PendingIntent.CanceledException unused) {
                        sessionActivity.toString();
                        return;
                    }
                }
                break;
            default:
                boolean z = dVar.f0;
                dVar.f0 = !z;
                if (!z) {
                    dVar.F.setVisibility(0);
                }
                dVar.l0 = dVar.f0 ? dVar.m0 : dVar.n0;
                dVar.u(true);
                break;
        }
    }
}
