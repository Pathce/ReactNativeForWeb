import {NativeModules} from 'react-native'

class Test2Module {
  getCurrentTime = async () => {
    return NativeModules.Clock.getCurrentTime();
  };
}

const Clock = new Test2Module();
export default Clock;