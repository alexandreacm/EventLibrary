import { NativeModules } from 'react-native';

const { Eventlibrary } = NativeModules;

export function onMyEvent(appName: string): Promise<string> {
  return Eventlibrary.onMyEvent(appName);
}
