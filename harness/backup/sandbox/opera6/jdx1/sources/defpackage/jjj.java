package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001:\u0002þ\u0002R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010(\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010!R\u0018\u0010*\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b)\u0010\u0004R\u0018\u0010,\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010\u0004R\u0018\u0010.\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010\u0013R\u0018\u00100\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b/\u0010\u0013R\u0016\u00104\u001a\u0002018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b2\u00103R*\u00106\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b5\u0010\nR\u0018\u00109\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b<\u00108R\u0018\u0010?\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b>\u00108R\u0018\u0010A\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b@\u00108R\u0018\u0010C\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bB\u00108R\u0018\u0010E\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bD\u00108R\u0018\u0010G\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bF\u00108R\u0016\u0010I\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bH\u0010!R\u0018\u0010K\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bJ\u00108R\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bP\u0010\u000eR\u0016\u0010R\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u000eR\u0018\u0010T\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bS\u0010\u0004R\u0018\u0010V\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bU\u0010\u0004R\u001e\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010W8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010XR$\u0010\\\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010Z8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b3\u0010[R\u0018\u0010^\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b]\u0010\u0004R\u0016\u0010`\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b_\u0010!R\u0018\u0010b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\ba\u0010\u0004R\u0018\u0010d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bc\u0010\u0004R\u0016\u0010f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\be\u0010\u0004R$\u0010h\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bg\u0010\nR \u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020j0i8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bk\u0010[R\u0018\u0010n\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bm\u0010\u0013R$\u0010p\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bo\u0010\nR\u0014\u0010t\u001a\u00020q8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010x\u001a\u0004\u0018\u00010u8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010z\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\by\u0010!R\u0016\u0010|\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b{\u0010\u000eR\u0016\u0010~\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b}\u0010\u000eR\u0017\u0010\u0080\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010!R\u0019\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u00108R\u001a\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u00108R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0089\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010!R\u0018\u0010\u008b\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010!R\u0018\u0010\u008d\u0001\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010\u001dR\u0018\u0010\u008f\u0001\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010\u000eR\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0095\u0001\u001a\u0002018\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u00103R\u001a\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010\u0004R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001a\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010\u0004R\u001a\u0010\u009f\u0001\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010NR\u001a\u0010£\u0001\u001a\u00030 \u00018\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001a\u0010¥\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010\u0004R\u001a\u0010§\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010\u0004R\u001a\u0010©\u0001\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010\u0013R\u0018\u0010«\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bª\u0001\u0010!R\u0018\u0010\u00ad\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010!R\u001a\u0010¯\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b®\u0001\u0010\u0004R\u001a\u0010±\u0001\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b°\u0001\u00108R\u001a\u0010³\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b²\u0001\u0010\u0004R\u001a\u0010µ\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b´\u0001\u0010\u0004R\u001a\u0010·\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010\u0004R\u0018\u0010¹\u0001\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¸\u0001\u0010\u0004R\u001a\u0010»\u0001\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bº\u0001\u00108R\u001a\u0010½\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¼\u0001\u0010\u0004R\u001a\u0010¿\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¾\u0001\u0010\u0004R\u001a\u0010Á\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÀ\u0001\u0010\u0004R\u001a\u0010Ã\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÂ\u0001\u0010\u0004R\u001a\u0010Å\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÄ\u0001\u0010\u0004R\u001a\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÆ\u0001\u0010\u0004R\u001a\u0010É\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÈ\u0001\u0010\u0004R\u001a\u0010Ë\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÊ\u0001\u0010\u0004R\u001a\u0010Í\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÌ\u0001\u0010\u0004R\u001a\u0010Ï\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÎ\u0001\u0010\u0004R\u001a\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÐ\u0001\u0010\u0004R\u0018\u0010Ó\u0001\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÒ\u0001\u0010\u0004R\u0016\u0010Õ\u0001\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bÔ\u0001\u0010\u000eR\u0018\u0010×\u0001\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÖ\u0001\u0010\u000eR\u001a\u0010Ù\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bØ\u0001\u0010\u0004R\u001a\u0010Û\u0001\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÚ\u0001\u00108R\u001a\u0010Ý\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÜ\u0001\u0010\u0004R\u0018\u0010á\u0001\u001a\u00030Þ\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u001a\u0010ã\u0001\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bâ\u0001\u0010\u0013R\u001a\u0010å\u0001\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bä\u0001\u0010\u0013R\u001a\u0010ç\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bæ\u0001\u0010\u0004R\u001a\u0010é\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bè\u0001\u0010\u0004R\u001a\u0010ë\u0001\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bê\u0001\u0010\u0013R\u0018\u0010í\u0001\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bì\u0001\u0010\u000eR\u001a\u0010ï\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bî\u0001\u0010\u0004R\u001a\u0010ñ\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bð\u0001\u0010\u0004R&\u0010ó\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\b8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bò\u0001\u0010\nR\u001a\u0010õ\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bô\u0001\u0010\u0004R\u001a\u0010÷\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bö\u0001\u0010\u0004R\u001a\u0010ù\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bø\u0001\u0010\u0004R\u001a\u0010û\u0001\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bú\u0001\u0010\u0013R\u001a\u0010ý\u0001\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bü\u0001\u00108R\u001a\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bþ\u0001\u0010\u0004R\u001a\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0080\u0002\u00108R\u001a\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0082\u0002\u00108R\u001a\u0010\u0085\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0084\u0002\u00108R\u001a\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0086\u0002\u0010\u0004R\u001a\u0010\u0089\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0088\u0002\u0010\u0013R\u001a\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u008a\u0002\u0010\u0004R\u001c\u0010\u008f\u0002\u001a\u0005\u0018\u00010\u008c\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u008d\u0002\u0010\u008e\u0002R\u001c\u0010\u0091\u0002\u001a\u0005\u0018\u00010 \u00018\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0090\u0002\u0010¢\u0001R\u001a\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u0092\u0002\u00108R\"\u0010\u0097\u0002\u001a\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0094\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0095\u0002\u0010\u0096\u0002R\"\u0010\u0099\u0002\u001a\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0094\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0098\u0002\u0010\u0096\u0002R\u001a\u0010\u009b\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009a\u0002\u0010\u0013R\u001a\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009c\u0002\u0010\u0004R\u001a\u0010\u009f\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b\u009e\u0002\u0010\u0013R\u001a\u0010¡\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b \u0002\u0010\u0013R\u001a\u0010£\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¢\u0002\u00108R\u001a\u0010¥\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¤\u0002\u0010\u0013R\u001c\u0010©\u0002\u001a\u0005\u0018\u00010¦\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b§\u0002\u0010¨\u0002R\u001a\u0010«\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bª\u0002\u0010\u0013R\u001a\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¬\u0002\u00108R\u001a\u0010¯\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b®\u0002\u00108R\u001a\u0010±\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b°\u0002\u0010\u0004R\u001a\u0010³\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b²\u0002\u00108R\u0018\u0010µ\u0002\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b´\u0002\u0010!R\u001a\u0010·\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¶\u0002\u0010\u0013R\u001a\u0010¹\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¸\u0002\u0010\u0013R\u001a\u0010»\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bº\u0002\u00108R\u001a\u0010½\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¼\u0002\u0010\u0004R\u001a\u0010¿\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\b¾\u0002\u0010\u0013R\u001a\u0010Á\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÀ\u0002\u0010\u0004R\u001a\u0010Ã\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÂ\u0002\u0010\u0004R\u001a\u0010Å\u0002\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÄ\u0002\u0010\u0004R\u001a\u0010Ç\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÆ\u0002\u0010\u0013R\u001a\u0010É\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÈ\u0002\u00108R\u001a\u0010Ë\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÊ\u0002\u00108R&\u0010Í\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010Z8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÌ\u0002\u0010[R\u001a\u0010Ï\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÎ\u0002\u0010\u0013R\u001a\u0010Ñ\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÐ\u0002\u00108R\u001a\u0010Ó\u0002\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÒ\u0002\u0010NR\u001c\u0010×\u0002\u001a\u0005\u0018\u00010Ô\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\bÕ\u0002\u0010Ö\u0002R&\u0010Ù\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010Z8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bØ\u0002\u0010[R\u001a\u0010Û\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bÚ\u0002\u00108R\u001c\u0010ß\u0002\u001a\u0005\u0018\u00010Ü\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\bÝ\u0002\u0010Þ\u0002R\u001c\u0010ã\u0002\u001a\u0005\u0018\u00010à\u00028\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\bá\u0002\u0010â\u0002R*\u0010é\u0002\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0006\bä\u0002\u0010å\u0002\u001a\u0006\bæ\u0002\u0010ç\u0002\"\u0005\b\u0003\u0010è\u0002R)\u0010ë\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\bê\u0002\u00108\u001a\u0006\bë\u0002\u0010ì\u0002\"\u0005\b\r\u0010í\u0002R)\u0010ï\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\bî\u0002\u0010\u0013\u001a\u0006\bï\u0002\u0010ð\u0002\"\u0005\b\t\u0010ñ\u0002R\u001a\u0010ó\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bò\u0002\u0010\u0013R\u001a\u0010õ\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bô\u0002\u00108R\u001a\u0010÷\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bö\u0002\u00108R\u001a\u0010ù\u0002\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bø\u0002\u00108R\u001a\u0010û\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bú\u0002\u0010\u0013R\u001a\u0010ý\u0002\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0007\n\u0005\bü\u0002\u0010\u0013¨\u0006ÿ\u0002"}, d2 = {"Ljjj;", "", "", "a", "Ljava/lang/String;", "adIdPermission", "Ljava/util/ArrayList;", "Lgq;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "adSizeArray", "", "c", "Z", "isGreaterThanMaxAllowedBannerSize", "d", "responsiveAutoFormat", "e", "Ljava/lang/Boolean;", "adaptiveSlot", "f", "format", "g", "fluidType", "h", "multipleAdSizeString", "", "i", "F", "screenDensity", "", "j", "I", "screenWidth", "k", "screenHeight", "l", "screenWidthDip", "m", "screenHeightDip", "n", "orientation", "o", "adUnitId", "p", "isRewarded", "q", "isRewardedInterstitial", "", "r", "J", "requestTimeMilliseconds", "s", "keywords", "t", "Ljava/lang/Integer;", "safeAreaMarginLeftDip", "u", "safeAreaMarginTopDip", "v", "safeAreaMarginRightDip", "w", "safeAreaMarginBottomDip", "x", "roundedCornerTopLeftDip", "y", "roundedCornerTopRightDip", "z", "roundedCornerBottomLeftDip", "A", "roundedCornerBottomRightDip", "B", "tagForChildDirectedTreatment", "C", "tagForAgeTreatment", "Lprb;", "D", "Lprb;", "csrbEcoData", "E", "isTestRequest", "manualImpressionsEnabled", "G", "publisherProvidedId", "H", "contentUrl", "", "Ljava/util/Set;", "neighboringContentUrls", "", "Ljava/util/Map;", "customTargeting", "K", "requestAgent", "L", "tagForUnderAgeOfConsent", "M", "maxAdContentRating", "N", "adResponseEncryptionKey", "O", "adShieldSignal", "P", "adTypes", "", "Lsr;", "Q", "adapterVersionData", "R", "appSwitched", "S", "grantedPermissions", "Lbdg;", "T", "Lbdg;", "personallyIdentifiableInformation", "Lxfh;", "U", "Lxfh;", "qualitySignals", "V", "audioMode", "W", "isMusicActive", "X", "isSpeakerPhoneOn", "Y", "musicVolume", "minMusicVolume", "a0", "maxMusicVolume", "", "b0", "Ljava/lang/Double;", "musicVolumePercent", "c0", "ringerMode", "d0", "ringerVolume", "e0", "appVolume", "f0", "isAppMuted", "Le77;", "g0", "Le77;", "deviceSignals", "h0", "timeSinceCldUpdate", "i0", "adUnitRequestSignals", "Lwpb;", "j0", "Lwpb;", "adUnitRequestSignalsObject", "k0", "commonCldSignals", "l0", "commonCldSignalsObject", "Landroid/os/Bundle;", "m0", "Landroid/os/Bundle;", "sharedPreferenceSignals", "n0", "creativeToken", "o0", "debugSignalsEnabled", "p0", "shouldCollectAdResponseLogs", "q0", "testMode", "r0", "linkedDevice", "s0", "inspectorExtras", "t0", "requestServerData", "u0", "omidVersion", "v0", "clientOmidVersion", "w0", "omidPartnerName", "x0", "packageName", "y0", "versionCode", "z0", "appName", "A0", "versionName", "B0", "displayLabel", "C0", "requestId", "D0", "realTimeBiddingSignals", "F0", "gmpAppId", "G0", "appInstanceId", "H0", "adEventId", "I0", "appIdOrigin", "J0", "appWebPropertyCode", "K0", "applicationCode", "L0", "afmaVersion", "M0", "isNonagon", "N0", "isDecagon", "O0", "additionalCapabilities", "P0", "targetApi", "Q0", "granularVersion", "Lxpi;", "R0", "Lxpi;", "sdkEnvironment", "S0", "canOpenGeo", "T0", "canOpenHttp", "U0", "countryCode", "V0", "deviceCountryCode", "W0", "isEmulator", "X0", "isLatchskyDevice", "Y0", "languageCode", "Z0", "clientLanguageCode", "a1", "languageCodeList", "b1", "deviceLanguageCode", "c1", "marketVersion", "d1", "submodel", "e1", "isBattlestarDevice", "f1", "buildApiLevel", "g1", "carrierCode", "h1", "networkTypeCoarse", "i1", "networkTypeFine", "j1", "phoneType", "k1", "experimentIds", "l1", "transparentBackgroundSupported", "m1", "sessionId", "Lpq;", "n1", "Lpq;", "adUnitQualitySignals", "o1", "googleExtrasBundle", "p1", "nativeVersion", "", "q1", "Ljava/util/List;", "nativeTemplates", "r1", "nativeCustomTemplates", "s1", "enableNativeMediaOrientation", "t1", "nativeMediaOrientation", "u1", "customMuteThisAdRequested", "v1", "customClickGestureEnabled", "w1", "customClickGestureDirection", "x1", "customClickGestureAllowTaps", "Lj4n;", "y1", "Lj4n;", "videoOptionsSignal", "z1", "isImageLoadingDisabled", "A1", "adChoicesPlacement", "B1", "numberOfRegisteredWebViews", "C1", "topics", "D1", "topicsApiStatus", "E1", "adServicesExtensionVersion", "F1", "isBannerRefreshRequest", "G1", "isIconAdRequest", "H1", "iconAdPlacement", "I1", "correlator", "J1", "usesMediaView", "K1", "installerPackage", "L1", "initiatorPackage", "M1", "signalType", "N1", "isScarRequest", "O1", "publisherPrivacyPersonalizationState", "P1", "isHsdpSupported", "Q1", "preProcessedSignals", "R1", "isPrefetchRequest", "S1", "displayCount", "T1", "localSignals", "Lw0g;", "U1", "Lw0g;", "parentAdConfig", "V1", "inMemorySdkCoreData", "W1", "numberOfAdsRequested", "Lo45;", "X1", "Lo45;", "clientRequestBuildingData", "Lx0g;", "Y1", "Lx0g;", "parentCommonConfig", "Z1", "Ljava/lang/Long;", "getTimeSinceSdkInitMs", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "timeSinceSdkInitMs", "a2", "isS2SRecursiveRequest", "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)V", "b2", "isAdapterInitConfigSet", "()Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)V", "c2", "isSwipeableInterstitial", "d2", "maxScreenHoldDurationSeconds", "e2", "maxSlotWidth", "f2", "maxSlotHeight", "g2", "persistentCacheRequest", "h2", "crossProcessRequest", "ads_mobile_sdk/l83", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class jjj {

    /* renamed from: A, reason: from kotlin metadata */
    @t2j("rc_br")
    public Integer roundedCornerBottomRightDip;

    /* renamed from: A0, reason: from kotlin metadata */
    @t2j("vnm")
    public String versionName;

    /* renamed from: A1, reason: from kotlin metadata */
    @t2j("preferred_ad_choices_position")
    public Integer adChoicesPlacement;

    /* renamed from: B, reason: from kotlin metadata */
    @t2j("tag_for_child_directed_treatment")
    public int tagForChildDirectedTreatment;

    /* renamed from: B0, reason: from kotlin metadata */
    @t2j("dl")
    public String displayLabel;

    /* renamed from: B1, reason: from kotlin metadata */
    @t2j("nrwv")
    public Integer numberOfRegisteredWebViews;

    /* renamed from: C, reason: from kotlin metadata */
    @t2j("tfat")
    public Integer tagForAgeTreatment;

    /* renamed from: C0, reason: from kotlin metadata */
    @t2j("request_id")
    public String requestId;

    /* renamed from: C1, reason: from kotlin metadata */
    @t2j("topics")
    public String topics;

    /* renamed from: D, reason: from kotlin metadata */
    @t2j("eco")
    public prb csrbEcoData;

    /* renamed from: D0, reason: from kotlin metadata */
    @t2j("rtb")
    public String realTimeBiddingSignals;

    /* renamed from: D1, reason: from kotlin metadata */
    @t2j("atps")
    public Integer topicsApiStatus;

    /* renamed from: E, reason: from kotlin metadata */
    @t2j("test_request")
    public boolean isTestRequest;
    public List E0;

    /* renamed from: E1, reason: from kotlin metadata */
    @t2j("aos")
    public int adServicesExtensionVersion;

    /* renamed from: F, reason: from kotlin metadata */
    @t2j("d_imp_hdr")
    public boolean manualImpressionsEnabled;

    /* renamed from: F0, reason: from kotlin metadata */
    @t2j("gmp_app_id")
    public String gmpAppId;

    /* renamed from: F1, reason: from kotlin metadata */
    @t2j("ibrr")
    public Boolean isBannerRefreshRequest;

    /* renamed from: G, reason: from kotlin metadata */
    @t2j("ppid")
    public String publisherProvidedId;

    /* renamed from: G0, reason: from kotlin metadata */
    @t2j("fbs_aiid")
    public String appInstanceId;

    /* renamed from: G1, reason: from kotlin metadata */
    @t2j("iconad")
    public Boolean isIconAdRequest;

    /* renamed from: H, reason: from kotlin metadata */
    @t2j("url")
    public String contentUrl;

    /* renamed from: H0, reason: from kotlin metadata */
    @t2j("fbs_aeid")
    public String adEventId;

    /* renamed from: H1, reason: from kotlin metadata */
    @t2j("iconad_placement")
    public Integer iconAdPlacement;

    /* renamed from: I, reason: from kotlin metadata */
    @t2j("neighboring_content_urls")
    public Set<String> neighboringContentUrls;

    /* renamed from: I0, reason: from kotlin metadata */
    @t2j("apm_id_origin")
    public String appIdOrigin;

    /* renamed from: I1, reason: from kotlin metadata */
    @t2j("correlation_id")
    public String correlator;

    /* renamed from: J, reason: from kotlin metadata */
    @t2j("custom_targeting")
    public Map<String, String> customTargeting;

    /* renamed from: J0, reason: from kotlin metadata */
    @t2j("app_wp_code")
    public String appWebPropertyCode;

    /* renamed from: J1, reason: from kotlin metadata */
    @t2j("uses_media_view")
    public Boolean usesMediaView;

    /* renamed from: K, reason: from kotlin metadata */
    @t2j("request_agent")
    public String requestAgent;

    /* renamed from: K0, reason: from kotlin metadata */
    @t2j("app_code")
    public String applicationCode;

    /* renamed from: K1, reason: from kotlin metadata */
    @t2j("ins_pn")
    public String installerPackage;

    /* renamed from: L, reason: from kotlin metadata */
    @t2j("tag_for_under_age_of_consent")
    public int tagForUnderAgeOfConsent;

    /* renamed from: L0, reason: from kotlin metadata */
    @NotNull
    @t2j("js")
    public String afmaVersion;

    /* renamed from: L1, reason: from kotlin metadata */
    @t2j("ini_pn")
    public String initiatorPackage;

    /* renamed from: M, reason: from kotlin metadata */
    @t2j("max_ad_content_rating")
    public String maxAdContentRating;

    /* renamed from: M0, reason: from kotlin metadata */
    @t2j("is_nonagon")
    public final boolean isNonagon;

    /* renamed from: M1, reason: from kotlin metadata */
    @t2j("signal_type")
    public String signalType;

    /* renamed from: N, reason: from kotlin metadata */
    @t2j("arek")
    public String adResponseEncryptionKey;

    /* renamed from: N0, reason: from kotlin metadata */
    @t2j("is_decagon")
    public boolean isDecagon;

    /* renamed from: N1, reason: from kotlin metadata */
    @t2j("scar")
    public Boolean isScarRequest;

    /* renamed from: O, reason: from kotlin metadata */
    @NotNull
    @t2j("ms")
    public String adShieldSignal;

    /* renamed from: O0, reason: from kotlin metadata */
    @t2j("extra_caps")
    public String additionalCapabilities;

    /* renamed from: O1, reason: from kotlin metadata */
    @t2j("ppt_p13n")
    public Integer publisherPrivacyPersonalizationState;

    /* renamed from: P, reason: from kotlin metadata */
    @NotNull
    @t2j("ad_types")
    public final ArrayList<String> adTypes;

    /* renamed from: P0, reason: from kotlin metadata */
    @t2j("target_api")
    public Integer targetApi;

    /* renamed from: P1, reason: from kotlin metadata */
    @t2j("lft")
    public Integer isHsdpSupported;

    /* renamed from: Q, reason: from kotlin metadata */
    @NotNull
    @t2j("installed_adapter_data")
    public final Map<String, sr> adapterVersionData;

    /* renamed from: Q0, reason: from kotlin metadata */
    @t2j("ev")
    public String granularVersion;

    /* renamed from: Q1, reason: from kotlin metadata */
    @t2j("p_signals")
    public Map<String, String> preProcessedSignals;

    /* renamed from: R, reason: from kotlin metadata */
    @t2j("app_switched")
    public Boolean appSwitched;

    /* renamed from: R0, reason: from kotlin metadata */
    @NotNull
    @t2j("sdk_env")
    public final xpi sdkEnvironment;

    /* renamed from: R1, reason: from kotlin metadata */
    @t2j("is_sdk_preload")
    public Boolean isPrefetchRequest;

    /* renamed from: S, reason: from kotlin metadata */
    @NotNull
    @t2j("android_permissions")
    public final ArrayList<String> grantedPermissions;

    /* renamed from: S0, reason: from kotlin metadata */
    @t2j("cog")
    public Boolean canOpenGeo;

    /* renamed from: S1, reason: from kotlin metadata */
    @t2j("dspct")
    public Integer displayCount;

    /* renamed from: T, reason: from kotlin metadata */
    @NotNull
    @t2j("pii")
    public final bdg personallyIdentifiableInformation;

    /* renamed from: T0, reason: from kotlin metadata */
    @t2j("coh")
    public Boolean canOpenHttp;

    /* renamed from: T1, reason: from kotlin metadata */
    @t2j("l_signals")
    public prb localSignals;

    /* renamed from: U, reason: from kotlin metadata */
    @t2j("quality_signals")
    public xfh qualitySignals;

    /* renamed from: U0, reason: from kotlin metadata */
    @t2j("gl")
    public String countryCode;

    /* renamed from: U1, reason: from kotlin metadata */
    @t2j("parent_ad_config")
    public w0g parentAdConfig;

    /* renamed from: V, reason: from kotlin metadata */
    @t2j("am")
    public int audioMode;

    /* renamed from: V0, reason: from kotlin metadata */
    @t2j("dgl")
    public String deviceCountryCode;

    /* renamed from: V1, reason: from kotlin metadata */
    @t2j("m_state")
    public Map<String, String> inMemorySdkCoreData;

    /* renamed from: W, reason: from kotlin metadata */
    @t2j("ma")
    public boolean isMusicActive;

    /* renamed from: W0, reason: from kotlin metadata */
    @t2j("simulator")
    public Boolean isEmulator;

    /* renamed from: W1, reason: from kotlin metadata */
    @t2j("max_num_ads")
    public Integer numberOfAdsRequested;

    /* renamed from: X, reason: from kotlin metadata */
    @t2j("sp")
    public boolean isSpeakerPhoneOn;

    /* renamed from: X0, reason: from kotlin metadata */
    @t2j("is_latchsky")
    public boolean isLatchskyDevice;

    /* renamed from: X1, reason: from kotlin metadata */
    @t2j("csrb_output")
    public o45 clientRequestBuildingData;

    /* renamed from: Y, reason: from kotlin metadata */
    @t2j("muv")
    public int musicVolume;

    /* renamed from: Y0, reason: from kotlin metadata */
    @t2j("hl")
    public String languageCode;

    /* renamed from: Y1, reason: from kotlin metadata */
    @t2j("parent_common_config")
    public x0g parentCommonConfig;

    /* renamed from: Z, reason: from kotlin metadata */
    @t2j("muv_min")
    public Integer minMusicVolume;

    /* renamed from: Z0, reason: from kotlin metadata */
    @t2j("client_hl")
    public String clientLanguageCode;

    /* renamed from: Z1, reason: from kotlin metadata */
    @t2j("tsi")
    private Long timeSinceSdkInitMs;

    /* renamed from: a, reason: from kotlin metadata */
    @NotNull
    @t2j("adid_p")
    public String adIdPermission;

    /* renamed from: a0, reason: from kotlin metadata */
    @t2j("muv_max")
    public Integer maxMusicVolume;

    /* renamed from: a1, reason: from kotlin metadata */
    @NotNull
    @t2j("hl_list")
    public final ArrayList<String> languageCodeList;

    /* renamed from: a2, reason: from kotlin metadata */
    @t2j("s2s_rr")
    private Integer isS2SRecursiveRequest;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    @t2j("valid_ad_sizes")
    public final ArrayList<gq> adSizeArray;

    /* renamed from: b0, reason: from kotlin metadata */
    @t2j("muv_percent")
    public Double musicVolumePercent;

    /* renamed from: b1, reason: from kotlin metadata */
    @t2j("dlc")
    public String deviceLanguageCode;

    /* renamed from: b2, reason: from kotlin metadata */
    @t2j("ic")
    private Boolean isAdapterInitConfigSet;

    /* renamed from: c, reason: from kotlin metadata */
    @t2j("is_greater_than_max_allowed_banner_size")
    public boolean isGreaterThanMaxAllowedBannerSize;

    /* renamed from: c0, reason: from kotlin metadata */
    @t2j("rm")
    public int ringerMode;

    /* renamed from: c1, reason: from kotlin metadata */
    @t2j("mv")
    public String marketVersion;

    /* renamed from: c2, reason: from kotlin metadata */
    @t2j("isi")
    public Boolean isSwipeableInterstitial;

    /* renamed from: d, reason: from kotlin metadata */
    @t2j("rafmt")
    public String responsiveAutoFormat;

    /* renamed from: d0, reason: from kotlin metadata */
    @t2j("riv")
    public int ringerVolume;

    /* renamed from: d1, reason: from kotlin metadata */
    @t2j("submodel")
    public String submodel;

    /* renamed from: d2, reason: from kotlin metadata */
    @t2j("max_shd_s")
    public Integer maxScreenHoldDurationSeconds;

    /* renamed from: e, reason: from kotlin metadata */
    @t2j("inline_adaptive_slot")
    public Boolean adaptiveSlot;

    /* renamed from: e0, reason: from kotlin metadata */
    @t2j("android_app_volume")
    public float appVolume;

    /* renamed from: e1, reason: from kotlin metadata */
    @t2j("is_bstar")
    public Boolean isBattlestarDevice;

    /* renamed from: e2, reason: from kotlin metadata */
    @t2j("max_w")
    public Integer maxSlotWidth;

    /* renamed from: f, reason: from kotlin metadata */
    @t2j("format")
    public String format;

    /* renamed from: f0, reason: from kotlin metadata */
    @t2j("android_app_muted")
    public boolean isAppMuted;

    /* renamed from: f1, reason: from kotlin metadata */
    @t2j("build_api_level")
    public Integer buildApiLevel;

    /* renamed from: f2, reason: from kotlin metadata */
    @t2j("max_h")
    public Integer maxSlotHeight;

    /* renamed from: g, reason: from kotlin metadata */
    @t2j("fluid")
    public String fluidType;

    /* renamed from: g0, reason: from kotlin metadata */
    @NotNull
    @t2j("device")
    public final e77 deviceSignals;

    /* renamed from: g1, reason: from kotlin metadata */
    @t2j("carrier")
    public String carrierCode;

    /* renamed from: g2, reason: from kotlin metadata */
    @t2j("pcr")
    public Boolean persistentCacheRequest;

    /* renamed from: h, reason: from kotlin metadata */
    @t2j("sz")
    public String multipleAdSizeString;

    /* renamed from: h0, reason: from kotlin metadata */
    @t2j("cldut")
    public long timeSinceCldUpdate;

    /* renamed from: h1, reason: from kotlin metadata */
    @t2j("cnt")
    public Integer networkTypeCoarse;

    /* renamed from: h2, reason: from kotlin metadata */
    @t2j("cpr")
    public Boolean crossProcessRequest;

    /* renamed from: i, reason: from kotlin metadata */
    @t2j("u_sd")
    public float screenDensity;

    /* renamed from: i0, reason: from kotlin metadata */
    @t2j("fwd_cld")
    public String adUnitRequestSignals;

    /* renamed from: i1, reason: from kotlin metadata */
    @t2j("gnt")
    public Integer networkTypeFine;

    /* renamed from: j, reason: from kotlin metadata */
    @t2j("sw")
    public int screenWidth;

    /* renamed from: j0, reason: from kotlin metadata */
    @t2j("fwd_cld_obj")
    public wpb adUnitRequestSignalsObject;

    /* renamed from: j1, reason: from kotlin metadata */
    @t2j("pt")
    public Integer phoneType;

    /* renamed from: k, reason: from kotlin metadata */
    @t2j("sh")
    public int screenHeight;

    /* renamed from: k0, reason: from kotlin metadata */
    @t2j("fwd_common_cld")
    public String commonCldSignals;

    /* renamed from: k1, reason: from kotlin metadata */
    @t2j("eid")
    public String experimentIds;

    /* renamed from: l, reason: from kotlin metadata */
    @t2j("u_w")
    public int screenWidthDip;

    /* renamed from: l0, reason: from kotlin metadata */
    @t2j("fwd_common_cld_obj")
    public prb commonCldSignalsObject;

    /* renamed from: l1, reason: from kotlin metadata */
    @t2j("support_transparent_background")
    public Boolean transparentBackgroundSupported;

    /* renamed from: m, reason: from kotlin metadata */
    @t2j("u_h")
    public int screenHeightDip;

    /* renamed from: m0, reason: from kotlin metadata */
    @NotNull
    @t2j("shared_pref")
    public Bundle sharedPreferenceSignals;

    /* renamed from: m1, reason: from kotlin metadata */
    @t2j("session_id")
    public String sessionId;

    /* renamed from: n, reason: from kotlin metadata */
    @t2j("u_so")
    public String orientation;

    /* renamed from: n0, reason: from kotlin metadata */
    @t2j("gct")
    public String creativeToken;

    /* renamed from: n1, reason: from kotlin metadata */
    @t2j("ad_unit_quality_signals")
    public pq adUnitQualitySignals;

    /* renamed from: o, reason: from kotlin metadata */
    @t2j("slotname")
    public String adUnitId;

    /* renamed from: o0, reason: from kotlin metadata */
    @t2j("de")
    public String debugSignalsEnabled;

    /* renamed from: o1, reason: from kotlin metadata */
    @t2j("extras")
    public Bundle googleExtrasBundle;

    /* renamed from: p, reason: from kotlin metadata */
    @t2j("rbv")
    public Boolean isRewarded;

    /* renamed from: p0, reason: from kotlin metadata */
    @t2j("collect_response_logs")
    public Boolean shouldCollectAdResponseLogs;

    /* renamed from: p1, reason: from kotlin metadata */
    @t2j("native_version")
    public Integer nativeVersion;

    /* renamed from: q, reason: from kotlin metadata */
    @t2j("rbi")
    public Boolean isRewardedInterstitial;

    /* renamed from: q0, reason: from kotlin metadata */
    @t2j("test_mode")
    public int testMode;

    /* renamed from: q1, reason: from kotlin metadata */
    @t2j("native_templates")
    public List<String> nativeTemplates;

    /* renamed from: r, reason: from kotlin metadata */
    @t2j("start_signals_timestamp")
    public long requestTimeMilliseconds;

    /* renamed from: r0, reason: from kotlin metadata */
    @t2j("linked_device")
    public int linkedDevice;

    /* renamed from: r1, reason: from kotlin metadata */
    @t2j("native_custom_templates")
    public List<String> nativeCustomTemplates;

    /* renamed from: s, reason: from kotlin metadata */
    @t2j("kw")
    public ArrayList<String> keywords;

    /* renamed from: s0, reason: from kotlin metadata */
    @t2j("inspector_extras")
    public String inspectorExtras;

    /* renamed from: s1, reason: from kotlin metadata */
    @t2j("enable_native_media_orientation")
    public Boolean enableNativeMediaOrientation;

    /* renamed from: t, reason: from kotlin metadata */
    @t2j("sam_l")
    public Integer safeAreaMarginLeftDip;

    /* renamed from: t0, reason: from kotlin metadata */
    @t2j("risd")
    public Integer requestServerData;

    /* renamed from: t1, reason: from kotlin metadata */
    @t2j("native_media_orientation")
    public String nativeMediaOrientation;

    /* renamed from: u, reason: from kotlin metadata */
    @t2j("sam_t")
    public Integer safeAreaMarginTopDip;

    /* renamed from: u0, reason: from kotlin metadata */
    @t2j("omid_v")
    public String omidVersion;

    /* renamed from: u1, reason: from kotlin metadata */
    @t2j("use_custom_mute")
    public Boolean customMuteThisAdRequested;

    /* renamed from: v, reason: from kotlin metadata */
    @t2j("sam_r")
    public Integer safeAreaMarginRightDip;

    /* renamed from: v0, reason: from kotlin metadata */
    @t2j("client_omid_v")
    public String clientOmidVersion;

    /* renamed from: v1, reason: from kotlin metadata */
    @t2j("ccg_on")
    public Boolean customClickGestureEnabled;

    /* renamed from: w, reason: from kotlin metadata */
    @t2j("sam_b")
    public Integer safeAreaMarginBottomDip;

    /* renamed from: w0, reason: from kotlin metadata */
    @t2j("client_omid_p")
    public String omidPartnerName;

    /* renamed from: w1, reason: from kotlin metadata */
    @t2j("sccg_dir")
    public Integer customClickGestureDirection;

    /* renamed from: x, reason: from kotlin metadata */
    @t2j("rc_tl")
    public Integer roundedCornerTopLeftDip;

    /* renamed from: x0, reason: from kotlin metadata */
    @NotNull
    @t2j("pn")
    public String packageName;

    /* renamed from: x1, reason: from kotlin metadata */
    @t2j("sccg_tap")
    public Boolean customClickGestureAllowTaps;

    /* renamed from: y, reason: from kotlin metadata */
    @t2j("rc_tr")
    public Integer roundedCornerTopRightDip;

    /* renamed from: y0, reason: from kotlin metadata */
    @t2j("vc")
    public Integer versionCode;

    /* renamed from: y1, reason: from kotlin metadata */
    @t2j("video")
    public j4n videoOptionsSignal;

    /* renamed from: z, reason: from kotlin metadata */
    @t2j("rc_bl")
    public Integer roundedCornerBottomLeftDip;

    /* renamed from: z0, reason: from kotlin metadata */
    @t2j("an")
    public String appName;

    /* renamed from: z1, reason: from kotlin metadata */
    @t2j("disable_image_loading")
    public Boolean isImageLoadingDisabled;

    public jjj() {
        ArrayList<gq> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<String> arrayList3 = new ArrayList<>();
        bdg bdgVar = new bdg(0);
        e77 e77Var = new e77(0);
        Bundle bundle = new Bundle();
        xpi xpiVar = new xpi(0);
        ArrayList<String> arrayList4 = new ArrayList<>();
        this.adIdPermission = "0";
        this.adSizeArray = arrayList;
        this.isGreaterThanMaxAllowedBannerSize = false;
        this.responsiveAutoFormat = null;
        this.adaptiveSlot = null;
        this.format = null;
        this.fluidType = null;
        this.multipleAdSizeString = null;
        this.screenDensity = 0.0f;
        this.screenWidth = 0;
        this.screenHeight = 0;
        this.screenWidthDip = 0;
        this.screenHeightDip = 0;
        this.orientation = null;
        this.adUnitId = "";
        this.isRewarded = null;
        this.isRewardedInterstitial = null;
        this.requestTimeMilliseconds = 0L;
        this.keywords = null;
        this.safeAreaMarginLeftDip = null;
        this.safeAreaMarginTopDip = null;
        this.safeAreaMarginRightDip = null;
        this.safeAreaMarginBottomDip = null;
        this.roundedCornerTopLeftDip = null;
        this.roundedCornerTopRightDip = null;
        this.roundedCornerBottomLeftDip = null;
        this.roundedCornerBottomRightDip = null;
        this.tagForChildDirectedTreatment = 0;
        this.tagForAgeTreatment = null;
        this.csrbEcoData = null;
        this.isTestRequest = false;
        this.manualImpressionsEnabled = false;
        this.publisherProvidedId = null;
        this.contentUrl = null;
        this.neighboringContentUrls = null;
        this.customTargeting = null;
        this.requestAgent = null;
        this.tagForUnderAgeOfConsent = 0;
        this.maxAdContentRating = null;
        this.adResponseEncryptionKey = null;
        this.adShieldSignal = "";
        this.adTypes = arrayList2;
        this.adapterVersionData = linkedHashMap;
        this.appSwitched = null;
        this.grantedPermissions = arrayList3;
        this.personallyIdentifiableInformation = bdgVar;
        this.qualitySignals = null;
        this.audioMode = 0;
        this.isMusicActive = false;
        this.isSpeakerPhoneOn = false;
        this.musicVolume = 0;
        this.minMusicVolume = null;
        this.maxMusicVolume = null;
        this.musicVolumePercent = null;
        this.ringerMode = 0;
        this.ringerVolume = 0;
        this.appVolume = 0.0f;
        this.isAppMuted = false;
        this.deviceSignals = e77Var;
        this.timeSinceCldUpdate = 0L;
        this.adUnitRequestSignals = null;
        this.adUnitRequestSignalsObject = null;
        this.commonCldSignals = null;
        this.commonCldSignalsObject = null;
        this.sharedPreferenceSignals = bundle;
        this.creativeToken = null;
        this.debugSignalsEnabled = null;
        this.shouldCollectAdResponseLogs = null;
        this.testMode = 0;
        this.linkedDevice = 0;
        this.inspectorExtras = null;
        this.requestServerData = null;
        this.omidVersion = null;
        this.clientOmidVersion = null;
        this.omidPartnerName = null;
        this.packageName = "";
        this.versionCode = null;
        this.appName = null;
        this.versionName = null;
        this.displayLabel = null;
        this.requestId = null;
        this.realTimeBiddingSignals = null;
        this.E0 = null;
        this.gmpAppId = null;
        this.appInstanceId = null;
        this.adEventId = null;
        this.appIdOrigin = null;
        this.appWebPropertyCode = null;
        this.applicationCode = null;
        this.afmaVersion = "";
        this.isNonagon = false;
        this.isDecagon = true;
        this.additionalCapabilities = null;
        this.targetApi = null;
        this.granularVersion = null;
        this.sdkEnvironment = xpiVar;
        this.canOpenGeo = null;
        this.canOpenHttp = null;
        this.countryCode = null;
        this.deviceCountryCode = null;
        this.isEmulator = null;
        this.isLatchskyDevice = false;
        this.languageCode = null;
        this.clientLanguageCode = null;
        this.languageCodeList = arrayList4;
        this.deviceLanguageCode = null;
        this.marketVersion = null;
        this.submodel = null;
        this.isBattlestarDevice = null;
        this.buildApiLevel = null;
        this.carrierCode = null;
        this.networkTypeCoarse = null;
        this.networkTypeFine = null;
        this.phoneType = null;
        this.experimentIds = null;
        this.transparentBackgroundSupported = null;
        this.sessionId = null;
        this.adUnitQualitySignals = null;
        this.googleExtrasBundle = null;
        this.nativeVersion = null;
        this.nativeTemplates = null;
        this.nativeCustomTemplates = null;
        this.enableNativeMediaOrientation = null;
        this.nativeMediaOrientation = null;
        this.customMuteThisAdRequested = null;
        this.customClickGestureEnabled = null;
        this.customClickGestureDirection = null;
        this.customClickGestureAllowTaps = null;
        this.videoOptionsSignal = null;
        this.isImageLoadingDisabled = null;
        this.adChoicesPlacement = null;
        this.numberOfRegisteredWebViews = null;
        this.topics = null;
        this.topicsApiStatus = null;
        this.adServicesExtensionVersion = 0;
        this.isBannerRefreshRequest = null;
        this.isIconAdRequest = null;
        this.iconAdPlacement = null;
        this.correlator = null;
        this.usesMediaView = null;
        this.installerPackage = null;
        this.initiatorPackage = null;
        this.signalType = null;
        this.isScarRequest = null;
        this.publisherPrivacyPersonalizationState = null;
        this.isHsdpSupported = null;
        this.preProcessedSignals = null;
        this.isPrefetchRequest = null;
        this.displayCount = null;
        this.localSignals = null;
        this.parentAdConfig = null;
        this.inMemorySdkCoreData = null;
        this.numberOfAdsRequested = null;
        this.clientRequestBuildingData = null;
        this.parentCommonConfig = null;
        this.timeSinceSdkInitMs = null;
        this.isS2SRecursiveRequest = null;
        this.isAdapterInitConfigSet = null;
        this.isSwipeableInterstitial = null;
        this.maxScreenHoldDurationSeconds = null;
        this.maxSlotWidth = null;
        this.maxSlotHeight = null;
        this.persistentCacheRequest = null;
        this.crossProcessRequest = null;
    }

    public final void a(Long l) {
        this.timeSinceSdkInitMs = l;
    }

    public final void b() {
        this.isS2SRecursiveRequest = 1;
    }
}
