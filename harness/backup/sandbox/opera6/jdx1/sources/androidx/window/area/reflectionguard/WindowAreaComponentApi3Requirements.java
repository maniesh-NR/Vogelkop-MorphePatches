package androidx.window.area.reflectionguard;

import android.app.Activity;
import android.util.DisplayMetrics;
import defpackage.ll8;
import defpackage.pp5;

/* loaded from: classes.dex */
public interface WindowAreaComponentApi3Requirements {
    void addRearDisplayPresentationStatusListener(pp5 pp5Var);

    void addRearDisplayStatusListener(pp5 pp5Var);

    void endRearDisplayPresentationSession();

    void endRearDisplaySession();

    DisplayMetrics getRearDisplayMetrics();

    ll8 getRearDisplayPresentation();

    void removeRearDisplayPresentationStatusListener(pp5 pp5Var);

    void removeRearDisplayStatusListener(pp5 pp5Var);

    void startRearDisplayPresentationSession(Activity activity, pp5 pp5Var);

    void startRearDisplaySession(Activity activity, pp5 pp5Var);
}
