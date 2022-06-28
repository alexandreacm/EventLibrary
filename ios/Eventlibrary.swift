@objc(Eventlibrary)
class Eventlibrary: NSObject {

  @objc(onMyEvent:withResolver:withRejecter:)
  func onMyEvent(appName: String, resolve:RCTPromiseResolveBlock, reject: RCTPromiseRejectBlock) -> Void {
          
      var name: String = "Alexandre Marques";
      var age: Int = 41;
      var designation: String = "Senior Software Engineer";
      var salary: Double = 5500;

      resolve("\(appName) - \(name)")
  }
}
