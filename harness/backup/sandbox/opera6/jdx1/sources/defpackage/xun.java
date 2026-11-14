package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes.dex */
public final class xun extends DefaultHandler {
    public final ArrayList a = new ArrayList();
    public final StringBuilder b = new StringBuilder();
    public final zyk c;
    public boolean d;

    public xun(String str, boolean z) {
        this.c = z4c.b(new sz3((byte) 3, str, z));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        if (this.d) {
            this.b.append(cArr, i, (i2 + i) - i);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        if ("title".equalsIgnoreCase(str2)) {
            this.d = false;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        String value;
        if ("title".equalsIgnoreCase(str2) && this.b.length() == 0) {
            this.d = true;
            return;
        }
        boolean zEqualsIgnoreCase = "meta".equalsIgnoreCase(str2);
        ArrayList arrayList = this.a;
        if (zEqualsIgnoreCase) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                linkedHashMap.put(attributes.getLocalName(i), attributes.getValue(i));
            }
            arrayList.add(rbd.i(linkedHashMap));
        }
        if (((Boolean) this.c.getValue()).booleanValue() && "img".equalsIgnoreCase(str2) && "landingImage".equals(attributes.getValue("id")) && (value = attributes.getValue("src")) != null) {
            HashMap map = new HashMap();
            map.put("property", "thumbnail");
            map.put("content", value);
            arrayList.add(map);
        }
    }
}
