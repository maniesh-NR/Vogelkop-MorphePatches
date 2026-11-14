package defpackage;

import android.content.Context;
import androidx.work.Worker;
import com.opera.android.news.newsfeed.internal.NewsPushTokenUploaderWorker;
import com.opera.android.news.newsfeed.internal.NewsPushTrackEventsUploaderWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ese implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Worker d;

    public /* synthetic */ ese(Worker worker, String str, long j, byte b) {
        this.a = b;
        this.d = worker;
        this.b = str;
        this.c = j;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                NewsPushTokenUploaderWorker newsPushTokenUploaderWorker = (NewsPushTokenUploaderWorker) this.d;
                String str = this.b;
                long j = this.c;
                esd esdVar = NewsPushTokenUploaderWorker.f;
                Context context = ((ajc) newsPushTokenUploaderWorker).a;
                hd hdVar = hd.h;
                if (hdVar != null) {
                    ((mse) ((fse) hdVar.c).get()).f(j, str);
                } else {
                    hd.j(context).edit().remove("npt_unsent_token_track_events").apply();
                }
                return Unit.a;
            default:
                NewsPushTrackEventsUploaderWorker newsPushTrackEventsUploaderWorker = (NewsPushTrackEventsUploaderWorker) this.d;
                String str2 = this.b;
                long j2 = this.c;
                esd esdVar2 = NewsPushTrackEventsUploaderWorker.f;
                Context context2 = ((ajc) newsPushTrackEventsUploaderWorker).a;
                hd hdVar2 = hd.h;
                if (hdVar2 != null) {
                    synchronized (hdVar2.e) {
                        ((mse) ((fse) hd.h.d).get()).f(j2, str2);
                    }
                } else {
                    hd.j(context2).edit().remove("npt_unsent_push_track_events").apply();
                }
                return Unit.a;
        }
    }
}
