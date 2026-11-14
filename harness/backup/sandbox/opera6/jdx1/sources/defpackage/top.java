package defpackage;

import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class top {
    public static final g40 c = new g40("LocalTestingConfigParser");
    public final XmlPullParser a;
    public final wci b;

    public top(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
        irp irpVar = irp.c;
        wci wciVar = new wci((byte) 13);
        wciVar.c = new HashMap();
        this.b = wciVar;
    }

    public final void a(String str, evp evpVar) throws XmlPullParserException, IOException {
        while (true) {
            XmlPullParser xmlPullParser = this.a;
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if (!xmlPullParser.getName().equals(str)) {
                    throw new XmlPullParserException(sko.l("Expected '", str, "' tag but found '", xmlPullParser.getName(), "'."), xmlPullParser, null);
                }
                evpVar.zza();
            }
        }
    }
}
