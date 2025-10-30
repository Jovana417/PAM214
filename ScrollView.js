import { Text, StyleSheet, View, Pressable, TouchableOpacity, ScrollView, RefreshControl } from 'react-native'
import { useState } from 'react';
import { TouchableWithoutFeedback } from 'react-native-web';

export default function BotonesScreen()
{
  const [accion, setAccion] = useState('nada');
  const [isDisabled, setIsDisabled] = useState(false);

  const[refreshing, setRefreshing] = useState(false);
  const onRefresh = () => {
    setRefreshing(true);
    setTimeout(() => {
        setRefreshing(false);
    } 2000);
  }
  return (
    <ScrollView
    horizontal
    showVerticalScrollIndicator={false}
    refreshControl ={
        <RefreshControl refreshing ={refreshing} onRefresh={onRefreshing} />
    }
    stickyHeaderIndices={[0]}
    >
      <View style= {styles.header}>
        <Text>
          Activado:
        </Text>
        <Switch 
        onValueChange={() => setIsDisabled(!isDisabled)}
        value={!isDisabled}
        />
      </View>
        <Text>
            { accion }
        </Text>
        <View style={styles.content}>
        <Pressable 
          onPressIn={()=>setAccion ('Pressable In')}
          onPressOut={()=>setAccion ('Pressable Out')}
          onLongPress={()=>setAccion ('Pressable Long')}
          disabled={isDisabled}
        >
          {({pressed}) => (
            <View style={[styles.card, !pressed && styles.shadow]}>
            <View style={styles.mockImage}/>
            <text>
              {pressed ? 'Tarjeta presionada.' : 'Tarjeta no presionada.'}
            </text>
          </View>
          )}
        </Pressable>
        <TouchableOpacity
         activeOpacity={0.2}
         onPress={() => setAccion('Opacity')}
         disabled={isDisabled}
        >
          <View style={[styles.card, styles.shadow]}>
            <View style={styles.mockImage}/>
            <Text>
              Esta es una tarjeta.
            </Text>
          </View>
        </TouchableOpacity>
        <TouchableWithoutFeedback
        onPress={() => setAccion('Without Feedback')}
        disabled={isDisabled}
        >
          <View style={[styles.card, styles.shadow]}>
            <View style={styles.mockImage}/>
            <Text>
              Esta es una tarjeta.
            </Text>
          </View>
        </TouchableWithoutFeedback>
      </View>
      </ScrollView>
    ) 
}

estilos 
const styles = StyleSheet.create({
    header: {
        backgroundColor: '#f7f7f7',
        padding: 20,
        alignItems: 'center',
        borderBottomWidth: 1,
        borderBottomColor: '#ddd',
    },
    content: {
        alignItems: 'center',
        backgroundColor: '#cbd2d0ff',
        paddingTop: 10,
    },
    card: {
        width: 200,
        height: 250,
        backgroundColor: 'white',
        padding: 20,
        flexDirection: 'column',
        borderRadius: 8,
        margin: 15
    },
    mockImage: {
        flex: 1,
        backgroundColor: 'gray',
        marginBottom: 8,
        borderRadius: 8
    },
    shadow: {
        shadowColor: '#000',
        shadowOffset: { width: 0, height: 10 },
        shadowOpacity: 0.2,
        shadowRadius: 12,
        elevation: 10,
    },
});