# WebSocketExample
WebSocket JAVAEE7 example


Websocket teknolojisi RFC 6455 ve Websocket Javascript API’dan oluşur.
HTTP protokolüne uygun olmayan real time web uygulamarındaki karmaşık yapının basitleştirilmesini sağlar.Websocket’ler polling’e göre daha az band genişliğine ihtiyaç duyar.

Java EE 7  ile birlikte gelen JSR 356  speği sayesinde Java’da websocket uygulamaları geliştirilebilir.Web client üzerinden websocket JavaScript API ile websocket serverlara bağlantı kurulabilir. 
Websocket server, client’tan connection’ı bekler.Client ve server arasında kurulan kalıcı bağlantı sayesinde her iki taraf birbirine data gönderebilir hale gelir.

Hem server hem de client tarafında callback listenerlar mevcuttur.Bunlara bakacak olursak:

onOpen -> Connection ilk kurulduğunda çağrılır.
onMessage -> Yeni bir mesaj geldiğinde çağrılır.
onError -> onOpen, onClose ,onMessage ‘dan birinde hata olduğunda çağrılır.
onClose -> Connection kapatıldığında çağrılır.

En basit haliyle bir websocket örneği yapalım.Bu örnekte html sayfamızdaki textbox’a girilen veriyi
websocket aracılığıyla server’a gönderip cevabını alalım.Örneğin çalışabilmesi için server’ınızın websocket desteği olması gerekiyor.
Bu örneği çalıştırmak için tomcat8 kullanıldı.
