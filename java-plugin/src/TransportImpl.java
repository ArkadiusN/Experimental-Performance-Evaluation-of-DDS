/*
 * Plugin architecture of
 * vSOME/IP used for other
 * middleware options.
 *
 * Code written based on the
 * implementation of the Real-Time
 * Innovations, Inc.
 *
 */
 class TransportImpl {
     public class IMessaging {
         Object _vsomeip_requested_service_id;
         boolean _use_TCP;
         int getBatchSize(){return 0;};

         boolean support_listener(){
             return true;
         };

         boolean support_discovery(){
             return true;
         };

         void startvSomeIp(){

         };

         boolean isMulticast(){
             return false;
         }

         boolean use_TCP(){
             return false;
         }

         Object vSomeIP_offered_service_id(){
             return _vsomeip_requested_service_id;
         };

         Object vSomeIP_requested_service_id(){
             return _vsomeip_requested_service_id;
         };

         //Has to be change to "long"
         Object vSomeIP_instance_id(){
             return _vsomeip_requested_service_id;
         };

         Object vsomeipApp(){
             return _vsomeip_requested_service_id;
         }

         void startvSomeIPThread(Object param){
         };

     }

     private class SOMEIPTransportImpl {
         long _vsomeip_mtu;
         void test(){

         };
         void on_message_2(Object std){
             return;
         }

     }
}
