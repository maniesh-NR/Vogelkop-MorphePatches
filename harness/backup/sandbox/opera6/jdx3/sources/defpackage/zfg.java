package defpackage;

import J.N;
import androidx.annotation.NonNull;
import com.opera.android.browser.obml.Platform;

/* loaded from: classes.dex */
public final class zfg {
    @vkk
    public void a(@NonNull q5j q5jVar) {
        String str = q5jVar.b;
        if (str.equals("ga_usage_statistics")) {
            N.Mk5xAnHM(q5jVar.a.i("ga_usage_statistics"));
        } else if (str.equals("personalized_default") || str.equals("personalized_ads") || str.equals("personalized_news") || str.equals("process_news_topics")) {
            Platform.f();
        }
    }
}
