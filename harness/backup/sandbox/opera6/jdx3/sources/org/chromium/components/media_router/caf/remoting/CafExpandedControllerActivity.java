package org.chromium.components.media_router.caf.remoting;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.r;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import defpackage.fv2;
import defpackage.vz5;
import defpackage.wth;
import java.lang.ref.WeakReference;
import org.chromium.third_party.android.media.MediaController;

/* loaded from: classes.dex */
public class CafExpandedControllerActivity extends r implements a93 {
    public static final /* synthetic */ int h = 0;
    public Handler a;
    public MediaController b;
    public buh c;
    public MediaRouteButton d;
    public TextView e;
    public fv2 f;
    public final wth g = new wth((Object) this, (byte) 21);

    public final void f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WeakReference weakReference = buh.g;
        buh buhVar = weakReference != null ? (buh) weakReference.get() : null;
        if (buhVar == null || !buhVar.g()) {
            finish();
            return;
        }
        this.c = buhVar;
        ((c93) buhVar).e.add(this);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(2131558712);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content);
        viewGroup.setBackgroundColor(-16777216);
        MediaController mediaController = (MediaController) findViewById(2131362279);
        this.b = mediaController;
        mediaController.a = this.g;
        mediaController.c();
        MediaRouteButton mediaRouteButtonInflate = getLayoutInflater().inflate(2131558578, viewGroup, false);
        if (mediaRouteButtonInflate instanceof MediaRouteButton) {
            MediaRouteButton mediaRouteButton = mediaRouteButtonInflate;
            this.d = mediaRouteButton;
            viewGroup.addView(mediaRouteButton);
            this.d.bringToFront();
            vz5 vz5Var = ((c93) this.c).c;
            this.d.d((vz5Var != null ? (lrd) vz5Var.d : null).a());
        }
        this.e = (TextView) findViewById(2131362281);
        this.a = new Handler();
        this.f = new fv2(this, (byte) 28);
        t();
    }

    public final void onDestroy() {
        ((c93) this.c).e.remove(this);
        super.onDestroy();
    }

    public final void onMetadataUpdated() {
        t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        super.onResume();
        buh buhVar = this.c;
        if (buhVar == null || !buhVar.g()) {
            finish();
        }
    }

    public final void onStatusUpdated() {
        t();
    }

    public final RemoteMediaClient s() {
        return ((c93) this.c).a.getRemoteMediaClient();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        if (this.c.g()) {
            String friendlyName = ((c93) this.c).a.getCastDevice().getFriendlyName();
            this.e.setText(friendlyName != null ? getString(2132018121, friendlyName) : "");
            MediaController mediaController = this.b;
            mediaController.d();
            mediaController.b();
            mediaController.c();
            this.b.d();
            this.a.removeCallbacks(this.f);
            if (s().isPlaying()) {
                this.a.postDelayed(this.f, 1000L);
            }
        }
    }
}
