package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class fj9 {
    public static final List a;
    public static final String b;

    static {
        List listAsList = Arrays.asList(".ytmPaidContentOverlayHost", ".ytp-caption-window-container");
        a = listAsList;
        b = kik.c("\n        (function() {\n          if (!window.__operaForcePipOverlays) {\n            window.__operaForcePipOverlays = true;\n            const selector = " + CollectionsKt.P(listAsList, ",", "\"", "\"", 0, (Function1) null, 56) + ";\n            const hidden = new Map();\n            const hide = el => {\n              if (hidden.has(el)) return;\n              const style = getComputedStyle(el);\n              if (style.display === \"none\" || style.visibility === \"hidden\") return;\n              hidden.set(el, [\n                el.style.getPropertyValue(\"display\"),\n                el.style.getPropertyPriority(\"display\"),\n              ]);\n              el.style.setProperty(\"display\", \"none\", \"important\");\n            };\n            const hideAll = () => document.querySelectorAll(selector).forEach(hide);\n            const observer = new MutationObserver(hideAll);\n            document.addEventListener(\"enterpictureinpicture\", () => {\n              hideAll();\n              observer.observe(document.documentElement, { childList: true, subtree: true });\n            }, true);\n            document.addEventListener(\"leavepictureinpicture\", () => {\n              observer.disconnect();\n              hidden.forEach(([value, priority], el) => {\n                if (value) el.style.setProperty(\"display\", value, priority);\n                else el.style.removeProperty(\"display\");\n              });\n              hidden.clear();\n            }, true);\n          }\n          const videos = Array.from(document.getElementsByTagName(\"video\"));\n          const video = videos.find(v => !v.paused) ?? videos[0];\n          if (!video) return false;\n          video.removeAttribute(\"disablepictureinpicture\");\n          if (video.paused) video.play();\n          video.requestPictureInPicture();\n          return true;\n        })();\n    ");
    }
}
