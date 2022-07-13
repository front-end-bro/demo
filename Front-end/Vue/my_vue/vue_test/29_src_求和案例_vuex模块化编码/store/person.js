//人员相关的配置
import axios from "axios";
import {nanoid} from "nanoid";

export default {
    namespaced: true,//开启命名空间 使mapstate能读取到namespaced
    actions: {

        addPersonA(context, value) {
            if (value.name.indexOf('a') === 0) {
                context.commit('ADD_PERSON', value)
            } else {
                alert('添加的人必须是a开头的')
            }
        },
        addPersonServer(context) {
            axios.get('https://api.uixsj.cn/hitokoto/get?type=social').then(
                response => {
                    context.commit('ADD_PERSON', {id: nanoid(), name: response.data})
                },
                error => {
                    alert(error.message)
                }
            )
        }
    },
    mutations: {
        ADD_PERSON(state, value) {
            state.personList.unshift(value)
        }
    },
    state: {
        personList: [
            {id: '001', name: 'aaaa'}
        ]
    },
    getters: {
        firstPersonName(state) {
            return state.personList[0].name
        }
    },

}