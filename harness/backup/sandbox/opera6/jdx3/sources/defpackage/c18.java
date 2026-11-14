package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final /* synthetic */ class c18 extends nr9 implements Function2 {
    public static final c18 a = new c18(2, yng.class, "register", "register(Lorg/chromium/content_public/browser/WebContents;Lorg/chromium/content/browser/PopupController$HideablePopup;)V", 0);

    public final Object invoke(Object obj, Object obj2) {
        WebContents webContents = (WebContents) obj;
        xng xngVar = (xng) obj2;
        if (webContents != null) {
            webContents.X(yng.class, mkh.e).a.add(xngVar);
        }
        return Unit.a;
    }
}
