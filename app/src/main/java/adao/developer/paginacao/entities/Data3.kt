package adao.developer.paginacao.entities

data class Res(val data: Data)

data class Data(var res: List<Results>)

data class Results(val id: Int, var name: String)
