package defpackage;

import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import java.util.Map;

/* loaded from: classes.dex */
public interface hva {
    Map getFeatureFlags();

    String getLanguage();

    TestingConfiguration getTestingConfig();

    boolean isDebugMode();

    void setAutoPlayAdBreaks(boolean z);

    void setMaxRedirects(int i);
}
