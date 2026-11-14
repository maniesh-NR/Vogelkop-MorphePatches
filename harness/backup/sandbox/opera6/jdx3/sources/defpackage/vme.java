package defpackage;

import com.leanplum.utils.SizeUtil;
import com.opera.android.news.newsfeed.internal.NewsPushTokenUploaderWorker;
import com.opera.android.news.newsfeed.internal.NewsPushTrackEventsUploaderWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class vme implements Function0 {
    public final /* synthetic */ byte a;

    public /* synthetic */ vme(byte b) {
        this.a = b;
    }

    public final Object invoke() {
        switch (this.a) {
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                esd esdVar = NewsPushTokenUploaderWorker.f;
                break;
            case 11:
                esd esdVar2 = NewsPushTrackEventsUploaderWorker.f;
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                xhk xhkVar = xhk.a;
                break;
            case 23:
                kk3 kk3Var = new kk3((byte) 10);
                hp2 hp2Var = new hp2((byte) 8);
                bt8 bt8Var = new bt8((byte) 2);
                int i = u95.h;
                break;
        }
        return Unit.a;
    }
}
