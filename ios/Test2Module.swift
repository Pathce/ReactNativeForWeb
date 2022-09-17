//
//  Test2Module.swift
//  IPTSoftphone
//
//  Created by work_jic on 2022/09/16.
//

import Foundation

@objc(Clock)
class Clock: RCTEventEmitter {
  
  var timer: Timer?
  var count: int = 0
  
  @objc override static func requiresMainQueueSetup() -> Bool {
    return true
  }
  
  override func constantsToExport() -> [AnyHashable : Any]! {
    [:]
  }
  
  override func supportedEvents() -> [String]! {
    return ["onTimerUpdated"]
  }
  
  @objc func getCurrentTime(
    _ resolve: @escaping RCTPromiseResolveBlock,
    rejecter reject: @escaping RCTPromiseRejectBlock
  ) -> Void {
    let formatter = ISO8601DateFormatter()
    let isoDate = formatter.string(from: Date())
    resolve(isoDate)
  }
  
  @objc func onTimeUpdated() {
    count += 1
    sendEvent(withName: "onTimeUpdated", body: ["count": count])
  }
  
  @objc func dispatchEvnetEverySecond() {
    DispatchQueue.main.async {
      self.timer = Timer.scheduledTimer(
        timeInterval: 1,
        target: self,
        selector: #selector(self.onTimeUpdated),
        userInfo: nil,
        repeats: true)
    }
  }
}
